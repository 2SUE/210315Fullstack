package com.koreait.spring2;

import com.koreait.spring2.vo.InsertEntity;
import com.koreait.spring2.vo.LocationCodeEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Exam2Mapper {
    List<LocationCodeEntity> selLocationCodeList(SearchDTO param);
    List<LocationCodeEntity> selApartmentInfoList(SearchDTO param);
    int insApartmentInfoArr(InsertEntity param);
}
