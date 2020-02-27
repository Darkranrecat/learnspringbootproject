package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class User {
    private Integer id;
    private String name;
    private String account;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
