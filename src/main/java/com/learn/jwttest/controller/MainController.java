package com.learn.jwttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiutao.Tan
 * @date 2022-05-29
 */
@RestController
@RequestMapping("/jwt")
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
