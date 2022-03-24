package com.xjtlu.wiki.controller;

import com.xjtlu.wiki.entity.Test;
import com.xjtlu.wiki.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;

@RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/test/list")
    public List<Test> list(){

    return testService.list();

    }
}

