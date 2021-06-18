package com.koreait.spring2.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {
    private String deal_year;
    private int deal_month;
    private int deal_day;
    private String external_cd;
}
