package com.xjtlu.wiki.controller;

import com.xjtlu.wiki.entity.Demo;
import com.xjtlu.wiki.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/demo/list")
    public List<Demo> list(){

    return demoService.list();

    }
}

