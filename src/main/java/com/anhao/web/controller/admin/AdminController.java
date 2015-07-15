/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller.admin;

import com.anhao.commons.page.Order;
import com.anhao.commons.page.Page;
import com.anhao.commons.page.Pageable;
import com.anhao.commons.page.TableData;
import com.anhao.domain.Admin;
import com.anhao.domain.Role;
import com.anhao.service.AdminService;
import com.anhao.service.RoleService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 时间: 2015-7-14
 *
 * @author aboutdata
 */
@Controller
@RequestMapping("/admin/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/list")
    public String displayList(Model model) {
        List<Admin> lists = adminService.findAll();
        model.addAttribute("lists", lists);
        return "/admin/admin/list";
    }

    /**
     * 获取json数据
     *
     * @param iDisplayLength
     * @param iDisplayStart
     * @param sColName
     * @param sSortDir_0
     * @param sSearch
     * @param sEcho
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDatalist")
    public TableData<Admin> getData(int iDisplayLength,
            int iDisplayStart,
            String sColName,
            String sSortDir_0,
            String sSearch,
            int sEcho) {

        Pageable pageable = new Pageable(iDisplayStart, iDisplayLength);
        pageable.setOrderProperty("modifyDate");
        pageable.setOrderDirection(Order.Direction.desc);

        Page<Admin> pages = adminService.findPage(pageable,true);
        return new TableData<Admin>(pages, sEcho);
    }
}
