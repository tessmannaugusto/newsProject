package com.yinfo.yinfo3.controllers;


import com.yinfo.yinfo3.integrations.nytimes.service.NYTimesService;
import com.yinfo.yinfo3.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MockController {

    @Autowired
    public NYTimesService nyTimesService;

    @GetMapping("/getNews")
    private List<News> getNews(){
        return nyTimesService.getNews();
    }
}
