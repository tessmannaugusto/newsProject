package com.yinfo.yinfo3.integrations.nytimes.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NYTNews {

    private String section;
    private String subsection;
    private String title;
    @JsonProperty("abstract")
    private String newsabstract;
    private String url;
}
