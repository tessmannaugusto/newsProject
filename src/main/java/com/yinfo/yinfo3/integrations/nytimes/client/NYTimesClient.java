package com.yinfo.yinfo3.integrations.nytimes.client;

import com.yinfo.yinfo3.integrations.nytimes.contract.NYTResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "NYTimes", url = "https://api.nytimes.com/svc/topstories/v2/world.json")
public interface NYTimesClient {


    @GetMapping(consumes = "application/json")
    ResponseEntity<NYTResponse> getNews(@RequestParam("api-key") String apikey);

}
