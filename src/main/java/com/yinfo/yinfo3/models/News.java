package com.yinfo.yinfo3.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class News {

    private String section;
    private String subsection;
    private String title;
    private String newsabstract;
    private String url;
}
