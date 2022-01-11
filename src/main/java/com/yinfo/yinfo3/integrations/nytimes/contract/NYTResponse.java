package com.yinfo.yinfo3.integrations.nytimes.contract;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NYTResponse {

    private String status;
    private String copyright;
    private String section;
    private String num_results;

    private List<NYTNews> results;
}
