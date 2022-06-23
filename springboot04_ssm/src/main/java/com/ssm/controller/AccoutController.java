package com.ssm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @discription: AccoutController
 * Created by mingli on 2022/4/20 20:00.
 */

@RestController
@RequestMapping("account")
public class AccoutController {


    @GetMapping
    public String test(){
        System.out.println("Dasda");
        System.out.println("Dasda");
        System.out.println("Dasda");
        return "test";
    }

}
