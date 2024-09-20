package com.kgy.blog.controller;

import com.kgy.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    TestService testService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public List<Map<String, Object>> test(){
        List<Map<String, Object>> res = testService.test();

        return res;
    }
}


