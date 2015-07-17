/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller.member;

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
    public String getBigAutoCompleteData(String keyword,Model model) {
        
        System.out.println("keyword :" + keyword);
        String data = "{data:[{title:'中国好声音',result:{ff:'qq'}}]}";

//        {data:[{title:null,result:{}},{title:null,result:{}} ]}
        System.out.println("data :" + data);
        return data;
    }

}
