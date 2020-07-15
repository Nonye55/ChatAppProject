package com.chatApp.project1.mapper;

import com.chatApp.project1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT* FROM USERS WHERE username = #{usernmae}")
    User getUser (String username);

    @Insert("INSERT INTO USERS (username,salt,password,firstname,lastname) VALUES (#{username},#{salt},#{password},#{firstname},#{lastname})")
    @Options(useGeneratedKeys = true ,keyProperty = "userId")
    int insert(User user);

}