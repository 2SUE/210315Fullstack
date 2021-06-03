package com.sue.spring.board;

import lombok.*;

@Getter
@Setter
public class BoardDomain extends BoardEntity{
    private String writerNm;
    private String profileImg;
}
