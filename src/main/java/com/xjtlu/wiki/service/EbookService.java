package com.xjtlu.wiki.service;

import com.xjtlu.wiki.entity.Ebook;
import com.xjtlu.wiki.entity.EbookExample;
import com.xjtlu.wiki.mapper.EbookMapper;
import com.xjtlu.wiki.request.EbookReq;
import com.xjtlu.wiki.resp.CommonResp;
import com.xjtlu.wiki.resp.EbookResp;
import com.xjtlu.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebooksList) {
//            EbookResp ebookResp = new EbookResp();
//            BeanUtils.copyProperties(ebook,ebookResp);
//            respList.add(ebookResp);
//        }
        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);
        return list;
    }

}
