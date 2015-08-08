/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 时间: 2015-7-17
 *
 * @author aboutdata
 */
@Controller
@RequestMapping("/bigAutoComplete")
public class BigAutoCompleteController {

    @RequestMapping("/demo")
    public String displayBigAutoComplete(Model model) {

        return "/member/index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map getBigAutoCompleteData(String keyword, Model model) {

        System.out.println("keyword :" + keyword);

        Map result1 = new HashMap();
        result1.put("id", "1111111");

        Map mapContent = new HashMap();
        mapContent.put("title", "中国好声音");
        mapContent.put("result", result1);

        Map result2 = new HashMap();
        result2.put("id", "q222222q");

        Map mapContent1 = new HashMap();
        mapContent1.put("title", "中国移动网上营业厅");

        mapContent1.put("result", result2);

        Map result3 = new HashMap();
        result3.put("id", "333333333333");

        Map mapContent2 = new HashMap();
        mapContent2.put("title", "中国好声音 第一期");
        mapContent2.put("result", result3);

        Map json = new HashMap();

        List list = new ArrayList();
        list.add(mapContent);
        list.add(mapContent1);
        list.add(mapContent2);

        json.put("data", list);

        String data = "{data:[{title:'中国好声音',result:{ff:'qq'}}]}";

//        {data:[{title:null,result:{}},{title:null,result:{}} ]}
        System.out.println("data :" + data);
        return json;
    }

}
