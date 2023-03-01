package com.example.demo_wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.example")//扫描包，下方getMapping不能扫描不同包下的 多个包{"com.example","com.example"}
@RestController
public class testController {
    @GetMapping("/hello")
    public String hello(){
        return "hello World";
    }
}
