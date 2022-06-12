package com.owl.wiki.controller;

import com.owl.wiki.request.EbookRequest;
import com.owl.wiki.response.CommonResponse;
import com.owl.wiki.response.EbookResponse;
import com.owl.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    public CommonResponse<List<EbookResponse> > list(EbookRequest req){ //通过名称 模糊查询
        CommonResponse<List<EbookResponse> > resp = new CommonResponse<>();
        List<EbookResponse>  eList = ebookService.list(req);
        //resp.setSuccess(true); //由于默认是true就不设置
        resp.setContent(eList);
        return resp;
    }
}
