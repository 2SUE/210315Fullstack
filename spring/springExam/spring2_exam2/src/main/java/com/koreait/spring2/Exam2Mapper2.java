package com.koreait.spring2;

import com.koreait.spring2.vo.ApartmentInfoEntity;
import com.koreait.spring2.vo.LocationCodeEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Exam2Mapper2 {
    int insApartmentInfoArr(ApartmentInfoEntity param);
    List<LocationCodeEntity> selLocationCodeList();
    List<ApartmentInfoEntity> selApartmentInfoList(SearchDTO param);
}
