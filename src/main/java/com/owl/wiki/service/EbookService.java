package com.owl.wiki.service;

import com.owl.wiki.domain.Ebook;
import com.owl.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: ebook表的服务层
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/10 15:56
 */

@Service
public class EbookService {

    @Resource //注入EbookMapper @Resource是jdk的 @Autowired是spring的
    private EbookMapper ebookMapper;

    //interface EbookMapper 调用 EbookMapper.xml 这边获取查询结果
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
