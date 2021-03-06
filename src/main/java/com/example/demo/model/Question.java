package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer likeCount;
    private Integer commentCount;

}
