package com.sue.spring.board;

import lombok.*;

@Getter
@Setter
@ToString
public class BoardCmtEntity {
    private int icmt;
    private int iboard;
    private int iuser;
    private String cmt;
    private String regdate;
}