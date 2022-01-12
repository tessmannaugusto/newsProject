package com.yinfo.yinfo3.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class NewsEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String section;
    private String subsection;
    private String title;
    private String newsAbstract;
    private String url;
    private LocalDate date;
}
