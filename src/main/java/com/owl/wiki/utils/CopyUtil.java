package com.owl.wiki.utils;

/**
 * @description: 复制工具类 使用的是 BeanUtils.copyProperties
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/12日 20:34
 */

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CopyUtil {

    /**
     * 单体复制
     */
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance(); //使用类加载机制
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source, obj);
        return obj;
    }

    /**
     * 列表复制  参数2 Class<T> clazz 是List泛型里面的类
     */
    public static <T> List<T> copyList(List source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)){
            for (Object c: source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }
}
