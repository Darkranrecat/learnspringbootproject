package com.example.demo.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    public String avatarUrl;//fastjson自动转换驼峰命名，两者都行，而mybatis似乎不行

}
