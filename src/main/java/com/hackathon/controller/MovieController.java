package com.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: yli
 * @Date: 2018/10/31 15:17
 * @Description:
 */
@RestController
public class MovieController {

    @GetMapping("test")
    public String find(){
        String param = "卧铺";
        System.out.println(param);
        return param;
    }

}

