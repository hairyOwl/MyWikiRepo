package com.owl.wiki.service;

import com.owl.wiki.domain.Demo;
import com.owl.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: demo表的服务层
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/10 15:56
 */

@Service
public class DemoService {

    @Resource //注入DemoMapper @Resource是jdk的 @Autowired是spring的
    private DemoMapper demoMapper;

    //interface DemoMapper 调用 DemoMapper.xml 这边获取查询结果
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
