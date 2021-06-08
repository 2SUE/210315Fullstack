package com.sue.spring.board;

import lombok.*;

@Getter
@Setter
@ToString
public class BoardCmtDomain extends BoardCmtEntity {
    private String writerNm;
    private String profileImg;
}