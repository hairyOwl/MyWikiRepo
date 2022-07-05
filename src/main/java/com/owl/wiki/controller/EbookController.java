package com.owl.wiki.controller;

import com.owl.wiki.request.EbookRequest;
import com.owl.wiki.response.CommonResponse;
import com.owl.wiki.response.EbookResponse;
import com.owl.wiki.response.PageResponse;
import com.owl.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: ebook 接口
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/8 10:38
 */

@RestController //返回字符串或Json对象 @Controller返回一个页面
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService; //ebookService

    @GetMapping("/list")
    public CommonResponse<PageResponse<EbookResponse> > list(EbookRequest request){ //通过名称 模糊查询
        CommonResponse<PageResponse<EbookResponse> > response = new CommonResponse<>();
        PageResponse<EbookResponse> eList = ebookService.list(request); //电子书查询条件
        //resp.setSuccess(true); //由于默认是true就不设置
        response.setContent(eList);
        return response;
    }
}
