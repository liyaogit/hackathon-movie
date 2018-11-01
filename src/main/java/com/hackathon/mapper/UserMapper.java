package com.hackathon.mapper;


import com.hackathon.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "userName", column = "user_name")
    })
    List<User> selectAllUsers();


    @Insert("INSERT INTO user(user_name) VALUES(#{userName})")
    void insert(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(int id);

    @Update("UPDATE user SET user_name=#{userName} WHERE id =#{id}")
    void update(User record);
}