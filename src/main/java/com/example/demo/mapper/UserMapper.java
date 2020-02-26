package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    @Insert("insert into user (account,name,token,gmt_create,gmt_modified) values (#{account},#{name},#{token},#{gmt_create},#{gmt_modified})")
    void insert(User user);//mybatis自动编译时，上面的形参user在这个函数形参是类的时候会自动调用

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);//token
}
