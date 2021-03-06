package com.yinfo.yinfo3.mappers;

import com.yinfo.yinfo3.integrations.nytimes.contract.NYTNews;
import com.yinfo.yinfo3.models.News;
import org.springframework.stereotype.Service;

@Service
public class NYTNewsToNewsMapper {

    public News NYTNewsToNews(NYTNews nytNews){
        News mappedNews = new News();
        mappedNews.setSection(nytNews.getSection());
        mappedNews.setSubsection(nytNews.getSubsection());
        mappedNews.setTitle(nytNews.getTitle());
        mappedNews.setNewsAbstract(nytNews.getNewsabstract());
        mappedNews.setUrl(nytNews.getUrl());
        return mappedNews;
    }
}
