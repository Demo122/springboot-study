package com.example.controller;

import com.example.pojo.DataSource;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @discription: Test
 * Created by mingli on 2022/4/17 13:22.
 */

@Controller
@ResponseBody
@RequestMapping("test")
public class Test {

    @Autowired
    private DataSource dataSource;

    @GetMapping
    public String getTest(){
        System.out.println(dataSource);
        System.out.println("springboot running...");
        return "springboot running...sss";
    }

    @GetMapping("/users/{id}")
    public String getTest(@PathVariable int id){
        System.out.println("springboot running...users/{id}");
        return "users/{id}"+id;
    }

    @PostMapping(value = "/user")
    public String update(){
        User u=new User(12,"lisi","123456");
        return u.toString();
    }
}
