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

    @Autowired
    private MyUtils myUtils;

    public int selMaxPageVal(BoardDTO param) {
        return mapper.selMaxPageVal(param);
    }

    public List<BoardDomain> selBoardList(BoardDTO param) {
        param.setIuser(myUtils.getLoginUserPk());

        int startIdx = (param.getPage() - 1) * param.getRecordCnt();
        param.setStartIdx(startIdx);

        return mapper.selBoardList(param);
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

    public int delBoard(BoardEntity param) {
        //댓글 먼저 삭제한다.
        BoardCmtEntity cmtParam = new BoardCmtEntity();
        cmtParam.setIboard(param.getIboard());
        cmtMapper.delBoardCmt(cmtParam);

        param.setIuser(myUtils.getLoginUserPk());
        return mapper.delBoard(param);
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