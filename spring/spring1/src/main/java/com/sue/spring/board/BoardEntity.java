package com.sue.spring.board;

import lombok.*;

@Getter
@Setter
@ToString
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String regdt;
}
