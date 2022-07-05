package com.owl.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.owl.wiki.domain.Ebook;
import com.owl.wiki.domain.EbookExample;
import com.owl.wiki.mapper.EbookMapper;
import com.owl.wiki.request.EbookRequest;
import com.owl.wiki.response.EbookResponse;
import com.owl.wiki.response.PageResponse;
import com.owl.wiki.utils.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

    @Resource //注入EbookMapper @Resource是jdk的 @Autowired是spring的
    private EbookMapper ebookMapper;

    //interface EbookMapper 调用 EbookMapper.xml 这边获取查询结果
    public PageResponse<EbookResponse> list(EbookRequest req){
        //关键词查询
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//外条件
        if(!ObjectUtils.isEmpty(req.getName())) { //条件不为空时进行模糊查询
            criteria.andNameLike("%" + req.getName() + "%"); //名称模糊查询
        }

        //使用PageHelper 进行分页
        PageHelper.startPage(req.getPage(),req.getSize()); //当前页 ，每页数据量
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResponse> list = CopyUtil.copyList(ebookList, EbookResponse.class);

        //分页相关数据
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        LOG.info("总行数，{}",pageInfo.getTotal());//总行数
        LOG.info("总页数，{}",pageInfo.getPages());//总页数

        //封装响应体：总条数+当前页数据列表
        PageResponse<EbookResponse> pageResponse = new PageResponse<>();
        pageResponse.setTotal(pageInfo.getTotal());
        pageResponse.setList(list);

        return pageResponse;

    }
}
