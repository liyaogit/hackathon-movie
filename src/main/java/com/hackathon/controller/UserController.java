package com.hackathon.controller;

import com.hackathon.business.UserBusiness;
import com.hackathon.entity.User;
import com.hackathon.form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Auther: yli
 * @Date: 2018/10/31 15:17
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserBusiness userBusiness;

    @GetMapping("test")
    public String find(){
        String param = "卧铺";
        System.out.println(param);
        return param;
    }

    @GetMapping("list")
    public List<User> queryUsers(){
        return userBusiness.queryUserList();
    }

    @GetMapping("add")
    public void addUser(UserForm form){
        userBusiness.addUser(form);
    }

    @GetMapping("edit")
    public void editUser(UserForm form){
        userBusiness.updateUser(form);
    }

    @GetMapping("delete")
    public void deleteUser(int id){
        userBusiness.deleteUser(id);
    }
}

