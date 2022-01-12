package com.yinfo.yinfo3.services;


import com.yinfo.yinfo3.entities.NewsEntity;
import com.yinfo.yinfo3.mappers.NewsToNewsEntityMapper;
import com.yinfo.yinfo3.models.News;
import com.yinfo.yinfo3.repositories.NewsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class NewsRepositoryService {

    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private NewsToNewsEntityMapper newsToNewsEntityMapper;


    public void saveToNewsRepository(NewsEntity newsToBeSaved){
        newsRepository.saveAndFlush(newsToBeSaved);
    }

    public void saveListToNewsRepository(List<News> newsListToBeSaved){
        for(News news : newsListToBeSaved){
            NewsEntity newsEntity = newsToNewsEntityMapper.NewsToNewsEntity(news);
            newsRepository.saveAndFlush(newsEntity);
            log.info("Saved news: " + news.getTitle());
        }
    }



}
