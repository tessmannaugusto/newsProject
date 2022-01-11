package com.yinfo.yinfo3.integrations.nytimes.service;

import com.yinfo.yinfo3.integrations.nytimes.client.NYTimesClient;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTNews;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTResponse;
import com.yinfo.yinfo3.mappers.NYTNewsToNewsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class NYTimesService {

    @Autowired
    private NYTimesClient nyTimesClient;

    @Autowired
    private NYTNewsToNewsMapper nytNewsToNewsMapper;


    @Value("${api.key.nytimes}")
    private String apikey;

    public NYTResponse getNews(){
        NYTResponse response = nyTimesClient.getNews(apikey).getBody();
        log.info(String.valueOf(response));

        return response;
    }


    private List<NYTNews> filterNews(NYTResponse nytResponse){
        List<NYTNews> nonFilteredList = nytResponse.getResults();
        List<NYTNews> filteredNewsList = new ArrayList<>();
        for (NYTNews nytNews : nonFilteredList){


        }
        return filteredNewsList;
    }




}
