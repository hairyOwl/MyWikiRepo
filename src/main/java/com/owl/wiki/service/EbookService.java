package com.owl.wiki.service;

import com.owl.wiki.domain.Ebook;
import com.owl.wiki.domain.EbookExample;
import com.owl.wiki.mapper.EbookMapper;
import com.owl.wiki.request.EbookRequest;
import com.owl.wiki.response.EbookResponse;
import com.owl.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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
    public List<EbookResponse> list(EbookRequest req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//外条件
        if(!ObjectUtils.isEmpty(req.getName())) { //条件不为空时进行模糊查询
            criteria.andNameLike("%" + req.getName() + "%"); //名称模糊查询
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        return CopyUtil.copyList(ebookList,EbookResponse.class);

    }
}
