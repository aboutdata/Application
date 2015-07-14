/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller;

import com.anhao.commons.page.DataTablesRequest;
import com.anhao.commons.page.DataTablesResponse;
import com.anhao.commons.page.Order;
import com.anhao.commons.page.Page;
import com.anhao.commons.page.Pageable;
import com.anhao.commons.page.TableData;
import com.anhao.domain.Role;
import com.anhao.service.RoleService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author youyou
 */
@Controller
@RequestMapping("/admin")
public class DataTablesController {
    
    @Resource
    private RoleService roleService;
    
    @RequestMapping("/datatables/list.do")
    public String displayList(Model model) {
        List<Role> lists = roleService.findAll();
        model.addAttribute("lists", lists);
        return "/market/datatables/list";
    }
    
    @ResponseBody
    @RequestMapping(value = "/data.do")
//    public TableData<Role> getData(@RequestBody DataTablesRequest dataTablesRequest) {
    public TableData<Role> getData(int iDisplayLength,
            int iDisplayStart,
            String sColName,
            String sSortDir_0,
            String sSearch,
            int sEcho) {
        System.out.println("iDisplayLength " + iDisplayLength);
        System.out.println("iDisplayStart " + iDisplayStart);
        System.out.println("sColName " + sColName);
        System.out.println("sSortDir_0 " + sSortDir_0);
        System.out.println("sSearch " + sSearch);
        System.out.println("sEcho " + sEcho);
//        System.out.println("myname "+myName);
//        System.out.println("dataTablesRequest " + dataTablesRequest);
//        DataTablesResponse<List<String>> dataTablesResponse = new DataTablesResponse<List<String>>();
        Pageable pageable = new Pageable(iDisplayStart, iDisplayLength);
        pageable.setOrderProperty("modifyDate");
        pageable.setOrderDirection(Order.Direction.desc);
        
        Page<Role> pages = roleService.findPage(pageable);
//        dataTablesResponse.setTotalDisplayRecords(pages.getTotalPages());
//        dataTablesResponse.setTotalRecords((int) pages.getTotal());
//
//        List<List<String>> data = new ArrayList<List<String>>();
//        for (String[] nextArray : DATA) {
//            data.add(Arrays.asList(nextArray));
//        }
//
//        dataTablesResponse.setData(data);

        TableData<Role> tables = new TableData<Role>(pages, sEcho);
//        TableData<Role> tables = new TableData<Role>(pages, dataTablesRequest.getsEcho());

        return tables;
    }
}
