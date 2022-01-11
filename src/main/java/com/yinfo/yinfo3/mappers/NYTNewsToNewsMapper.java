package com.yinfo.yinfo3.mappers;

import com.yinfo.yinfo3.integrations.nytimes.contract.NYTNews;
import com.yinfo.yinfo3.models.News;

public class NYTNewsToNewsMapper {

    private News NYTNewsToNews(NYTNews nytNews){
        News mappedNews = new News();
        mappedNews.setSection(nytNews.getSection());
        mappedNews.setSubsection(nytNews.getSubsection());
        mappedNews.setTitle(nytNews.getTitle());
        mappedNews.setNewsabstract(nytNews.getNewsabstract());
        mappedNews.setUrl(nytNews.getUrl());
        return mappedNews;
    }
}
