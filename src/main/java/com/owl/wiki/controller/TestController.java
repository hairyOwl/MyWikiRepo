package com.owl.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Hello 接口
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/8 10:38
 */

@RestController //返回字符串或Json对象 @Controller返回一个页面
public class TestController {

    /*
    * 常见的网络请求方式 GET,POST,PUT,DELETE
    * */
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @RequestMapping("/hello") //支持所有请求方式
    @GetMapping("/hello") //RESTful风格指定接口类型
    public String hello(){
        return "Hello owl";
    }

    @PostMapping("/hello/post") //RESTful风格指定接口类型
    public String helloPost(String name){
        return "Hello post," + name;
    }
}
