package com.eastmoney.aaaatest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc
 * create by
 * create date on 2023/5/9
 */
@RestController
public class Test1Controller {

    @RequestMapping(value = "/test1")
    public String getTest(@RequestParam(required = false) String content){
        return "hahaha:"+content;
    }
}
