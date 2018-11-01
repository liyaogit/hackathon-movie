package com.hackathon.business;

import com.hackathon.entity.User;
import com.hackathon.form.UserForm;

import java.util.List;

/**
 * @Auther: yli
 * @Date: 2018/11/1 15:03
 * @Description:
 */
public interface UserBusiness {

    List<User> queryUserList();

    void addUser(UserForm form);

    void deleteUser(int id);

    void updateUser(UserForm form);
}
