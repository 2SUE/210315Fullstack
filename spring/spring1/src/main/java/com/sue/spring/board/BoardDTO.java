package com.sue.spring.board;

import lombok.*;

// parameter 용
@Getter
@Setter
public class BoardDTO {
    private int iboard;
    private int startIdx;
    private int recordCnt;
    private int searchType;
    private String searchText;
}
