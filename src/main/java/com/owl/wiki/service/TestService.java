package com.owl.wiki.service;

import com.owl.wiki.domain.Test;
import com.owl.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/10 15:56
 */

@Service
public class TestService {

    @Resource //注入TestMapper @Resource是jdk的 @Autowired是spring的
    private TestMapper testMapper;

    //interface TestMapper 调用 TestMapper.xml 这边获取查询结果
    public List<Test> list(){
        return testMapper.testList();
    }
}
