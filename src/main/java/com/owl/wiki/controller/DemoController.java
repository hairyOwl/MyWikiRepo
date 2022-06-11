package com.owl.wiki.controller;

import com.owl.wiki.domain.Demo;
import com.owl.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @description: demo 接口
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/8 10:38
 */

@RestController //返回字符串或Json对象 @Controller返回一个页面
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService; //demoService

    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
