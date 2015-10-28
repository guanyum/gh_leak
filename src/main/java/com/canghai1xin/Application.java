package com.canghai1xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
public class Application {

    @Resource
    JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/create")
    public void createUserTable(){
        jdbcTemplate.execute("drop table if EXISTS users");//error here
        jdbcTemplate.execute("create table users(" +
                             "id serial, first_name varchar(255), last_name varchar(255))");

    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
