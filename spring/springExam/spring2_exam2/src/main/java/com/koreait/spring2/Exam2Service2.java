package com.koreait.spring2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koreait.spring2.vo.ApartmentInfoEntity;
import com.koreait.spring2.vo.InsertEntity;
import com.koreait.spring2.vo.LocationCodeEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.Charset;
import java.util.List;

@Service
public class Exam2Service2 {
    @Autowired
    private Exam2Mapper2 mapper;

    public List<LocationCodeEntity> selLocationCodeList() { return mapper.selLocationCodeList(); }

    public List<ApartmentInfoEntity> selInfo(SearchDTO param) {
        return mapper.selApartmentInfoList(param);
    }

    public void saveData(SearchDTO param) {
        List<ApartmentInfoEntity> dbList = mapper.selApartmentInfoList(param);

        if(dbList.size() > 0) {
            return;
        }

        final String URL = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
        final String DECODESERVICEKEY = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX+NgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA==";

        String deal_ym = String.format("%s%02d", param.getDeal_year(), param.getDeal_month());

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("LAWD_CD", param.getExternal_cd())
                .queryParam("DEAL_YMD", deal_ym)
                .queryParam("serviceKey", DECODESERVICEKEY)
                .queryParam("numOfRows", "5000")
                .build(false);

        RestTemplate rest = new RestTemplate();
        rest.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        ResponseEntity<String> respEntity = rest.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        String result = respEntity.getBody();

        System.out.println(result);

        ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonNode = null;
        ApartmentInfoEntity[] list = null;
        try {
            jsonNode = om.readTree(result);
            list = om.treeToValue(jsonNode.path("response").path("body").path("items").path("item"), ApartmentInfoEntity[].class);
            System.out.println("list.length : " + list.length);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        for(ApartmentInfoEntity i : list) {
            System.out.println(i);
        }

        for(ApartmentInfoEntity i : list) {
            i.setLocation_cd(Integer.parseInt(param.getExternal_cd()));
            mapper.insApartmentInfoArr(i);
        }
    }
}