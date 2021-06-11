package com.sue.spring.board;

import com.sue.spring.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

// service가 로직 담당이라서 로직 부분은 여기서 쓴다~

@Service
public class BoardService {
    @Autowired
    private BoardMapper mapper;

    @Autowired
    private BoardCmtMapper cmtMapper;

    @Autowired
    private HttpSession session;

    public List<BoardDomain> selBoardList() {
        return mapper.selBoardList();
    }

    public BoardDomain selBoard(BoardDTO param) {
        return mapper.selBoard(param);
    }

    // return 값 = iboard 값
    public int writeMod(BoardEntity param) {
        UserEntity loginUser = (UserEntity) session.getAttribute("loginUser");
        param.setIuser(loginUser.getIuser());

        // 등록
        if(param.getIboard() == 0) {
            mapper.insBoard(param);
        } else {
            //수정
            return 0;
        }
        return param.getIboard();
    }

    public int insBoardCmt(BoardCmtEntity param) {
        UserEntity loginUser = (UserEntity) session.getAttribute("loginUser");
        param.setIuser(loginUser.getIuser());
        return cmtMapper.insBoardCmt(param);
    }

    public List<BoardCmtDomain> selBoardCmtList(BoardCmtEntity param) {
        return cmtMapper.selBoardCmtList(param);
    }

    public int delBoardCmt(BoardCmtEntity param) {
        UserEntity loginUser = (UserEntity) session.getAttribute("loginUser");
        param.setIuser(loginUser.getIuser());
        return cmtMapper.delBoardCmt(param);
    }

    public int updBoardCmt(BoardCmtEntity param) {
        UserEntity loginUser = (UserEntity) session.getAttribute("loginUser");
        param.setIuser(loginUser.getIuser());
        return cmtMapper.updBoardCmt(param);
    }
}