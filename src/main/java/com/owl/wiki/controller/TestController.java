package com.owl.wiki.controller;

import com.owl.wiki.domain.Test;
import com.owl.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: Hello 接口
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/8 10:38
 */

@RestController //返回字符串或Json对象 @Controller返回一个页面
public class TestController {

    // 自定义配置项目 如动态变量 配置缺省值防止未配置时无法启动
    // 配置文件的值 优先级高于 注解中的缺省值
    //@Value("${test.hello}")
    @Value("${test.hello:这是缺省值}")
    private String testHello;
    @Resource
    private TestService testService; //testService
    /*
    * 常见的网络请求方式 GET,POST,PUT,DELETE
    * */
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @RequestMapping("/hello") //支持所有请求方式
    @GetMapping("/hello") //RESTful风格指定接口类型
    public String hello(){
        return "Hello owl"+testHello;
    }

    @PostMapping("/hello/post") //RESTful风格指定接口类型
    public String helloPost(String name){
        return "Hello post," + name;
    }

    @GetMapping("/test/list") //RESTful风格指定接口类型
    public List<Test> list(){
        return testService.list();
    }
}
