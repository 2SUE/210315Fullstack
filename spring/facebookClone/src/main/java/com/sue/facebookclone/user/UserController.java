package com.sue.facebookclone.user;

import com.sue.facebookclone.common.MyConst;
import com.sue.facebookclone.feed.model.FeedDTO;
import com.sue.facebookclone.feed.model.FeedDomain2;
import com.sue.facebookclone.security.UserDetailsImpl;
import com.sue.facebookclone.user.model.UserEntity;
import com.sue.facebookclone.user.model.UserProfileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private MyConst myConst;

    @GetMapping("/login")
    public void login(UserEntity userEntity) {
        userEntity.setEmail("pirbak@daum.net");
    }

    @GetMapping("/join")
    public void join(UserEntity userEntity) {}

    @PostMapping("/join")
    public String joinProc(UserEntity userEntity) {
        service.join(userEntity);
        return "redirect:login?needEmail=1";
    }

    @GetMapping("/auth")
    public String auth(UserEntity param) {
        int result = service.auth(param);
        return "redirect:login?auth=" + result;
    }

    @GetMapping("/profile")
    public void profile(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        UserEntity loginUser = userDetails.getUser();
        model.addAttribute(myConst.PROFILE_LIST, service.selUserProfileList(loginUser));
    }

    @PostMapping("/profileImg")
    public String profileImg(MultipartFile[] imgArr) {
        service.profileImg(imgArr);
        return "redirect:profile";
    }

    @ResponseBody
    @GetMapping("/mainProfile")
    public Map<String, Object> mainProfile(UserProfileEntity param) {
        return service.updUserMainProfile(param);
    }

    @ResponseBody
    @GetMapping("/feedList")
    public List<FeedDomain2> selFeedList2(FeedDTO param) {
        return service.selFeedList2(param);
    }
}