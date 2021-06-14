package com.sue.spring.board;

import lombok.*;

// parameter 용
@Getter
@Setter
public class BoardDTO {
    private int iboard;
    private int iuser;
    private int selType; //0: 기본리스트, 1:좋아요리스트
    private int page = 1;
    private int startIdx;
    private int recordCnt = 5;
    private int searchType;
    private String searchText;
}
