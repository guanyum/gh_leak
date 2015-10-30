package com.canghai1xin.component.controller;

import com.canghai1xin.biz.service.GhLeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class VelocityController {

    @Autowired
    GhLeakService ghLeakService;

    @RequestMapping("/hello")
    public String hello(Map<String, Object> model) {
        List<String> data = Arrays.asList("1", "2");
        model.put("data", data);

        return "hello";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {
        model.put("list", ghLeakService.listAllGhHouse());

        return "list";
    }
}
