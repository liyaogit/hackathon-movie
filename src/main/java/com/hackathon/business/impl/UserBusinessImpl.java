package com.hackathon.business.impl;

import com.hackathon.business.UserBusiness;
import com.hackathon.entity.User;
import com.hackathon.form.UserForm;
import com.hackathon.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yli
 * @Date: 2018/11/1 15:03
 * @Description:
 */
@Service
public class UserBusinessImpl implements UserBusiness{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.selectAllUsers();
    }

    @Override
    public void addUser(UserForm form) {
        User user = new User();
        user.setUserName(form.getUserName());
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.delete(id);

    }

    @Override
    public void updateUser(UserForm form) {
        User user = new User();
        user.setUserName(form.getUserName());
        user.setId(form.getId());
        userMapper.update(user);

    }
}
