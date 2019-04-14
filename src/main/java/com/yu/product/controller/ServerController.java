package com.yu.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName ServerController
 * Description TODO
 *
 * @Author hadoop
 * Date 2019/4/14 19:00
 **/
@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String msg(){
        return "this is product msg";
    }
}
