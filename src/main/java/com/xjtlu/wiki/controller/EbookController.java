package com.xjtlu.wiki.controller;

import com.xjtlu.wiki.entity.Ebook;
import com.xjtlu.wiki.request.EbookReq;
import com.xjtlu.wiki.resp.CommonResp;
import com.xjtlu.wiki.resp.EbookResp;
import com.xjtlu.wiki.resp.PageResp;
import com.xjtlu.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}


