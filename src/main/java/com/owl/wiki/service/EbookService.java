package com.owl.wiki.service;

import com.owl.wiki.domain.Ebook;
import com.owl.wiki.domain.EbookExample;
import com.owl.wiki.mapper.EbookMapper;
import com.owl.wiki.request.EbookRequest;
import com.owl.wiki.response.EbookResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public List<EbookResponse> list(EbookRequest req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//外条件
        criteria.andNameLike("%"+req.getName()+"%"); //名称模糊查询
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        //将List<Ebook> 转为 List<EbookResponse>
        List<EbookResponse> responseList = new ArrayList<>();
        for (Ebook ebook : ebookList) { //对象的复制
            EbookResponse ebookResponse = new EbookResponse();
            BeanUtils.copyProperties(ebook,ebookResponse); //对象A 复制到 对象B  org.springframework.beans;
            responseList.add(ebookResponse);
        }
        return  responseList;
    }
}
