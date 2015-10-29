package com.canghai1xin.component.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class TestVelocityController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> model) {
        List<String> data = Arrays.asList("1", "2");
        model.put("data", data);

        return "hello";
    }
}
