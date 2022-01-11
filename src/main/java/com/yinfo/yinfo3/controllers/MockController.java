package com.yinfo.yinfo3.controllers;

import com.yinfo.yinfo3.integrations.nytimes.client.NYTimesClient;
import com.yinfo.yinfo3.integrations.nytimes.contract.NYTResponse;
import com.yinfo.yinfo3.integrations.nytimes.service.NYTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

    @Autowired
    public NYTimesService nyTimesService;

    @GetMapping("/getNews")
    private NYTResponse getNews(){
        return nyTimesService.getNews();
    }
}
