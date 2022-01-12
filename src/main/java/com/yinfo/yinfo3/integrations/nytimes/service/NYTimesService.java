package com.yinfo.yinfo3.integrations.nytimes.service;

import com.yinfo.yinfo3.integrations.nytimes.client.NYTimesClient;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTNews;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTResponse;
import com.yinfo.yinfo3.mappers.NYTNewsToNewsMapper;
import com.yinfo.yinfo3.models.News;
import com.yinfo.yinfo3.services.NewsRepositoryService;
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
    @Autowired
    private NewsRepositoryService newsRepositoryService;


    @Value("${api.key.nytimes}")
    private String apikey;

    public List<News> getNews(){
        try{
            NYTResponse response = nyTimesClient.getNews(apikey).getBody();
            if (response != null){
                List<News> newsList = filterNews(response);
                newsRepositoryService.saveListToNewsRepository(newsList);
                return newsList;
            }
            return null;

        }catch (Exception e){
            return null;
        }
    }


    private List<News> filterNews(NYTResponse nytResponse){
        List<NYTNews> nonFilteredList = nytResponse.getResults();
        List<News> filteredNewsList = new ArrayList<>();
        for (NYTNews nytNews : nonFilteredList){
            if(nytNews.getSection().equals("world")){
                News mapped = nytNewsToNewsMapper.NYTNewsToNews(nytNews);
                filteredNewsList.add(mapped);
            }
        }
        return filteredNewsList;
    }




}
