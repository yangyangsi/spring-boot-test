package com.hand.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String testMvc(Map<String,Object> map){
        map.put("jack","rose");
        return "test";
    }
}
