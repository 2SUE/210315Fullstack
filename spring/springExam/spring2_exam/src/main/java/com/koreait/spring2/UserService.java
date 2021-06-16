package com.koreait.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public int insUser(UserVO param) {
        return mapper.insUser(param);
    }

    public int selUser(UserVO param) {
        UserVO vo = mapper.selUser(param);

        if(vo == null) {
            return 0;
        } else if(vo.getUpw().equals(param.getUpw())) {
            return 1;
        } else {
            return 2;
        }
    }
}
