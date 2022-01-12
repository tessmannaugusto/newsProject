package com.yinfo.yinfo3.mappers;

import com.yinfo.yinfo3.entities.NewsEntity;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTNews;
import com.yinfo.yinfo3.models.News;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NewsToNewsEntityMapper {

    public NewsEntity NewsToNewsEntity(News nytNews){
        NewsEntity mappedNews = new NewsEntity();
        mappedNews.setSection(nytNews.getSection());
        mappedNews.setSubsection(nytNews.getSubsection());
        mappedNews.setTitle(nytNews.getTitle());
        mappedNews.setNewsAbstract(nytNews.getNewsAbstract());
        mappedNews.setUrl(nytNews.getUrl());
        mappedNews.setDate(LocalDate.now());
        return mappedNews;
    }
}
