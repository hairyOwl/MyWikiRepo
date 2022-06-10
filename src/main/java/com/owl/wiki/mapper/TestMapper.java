package com.owl.wiki.mapper;

import com.owl.wiki.domain.Test;

import java.util.List;

/**
 * @description: Test实体类的持久层
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/10 15:21
 */
public interface TestMapper {

    //test列表
    public List<Test> testList();
}
