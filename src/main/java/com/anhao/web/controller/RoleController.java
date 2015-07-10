/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller;

import com.anhao.domain.Role;
import com.anhao.service.RoleService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/admin")
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping("/role/list.do")
    public String displayList(Model model) {
        List<Role> lists = roleService.findAll();
        model.addAttribute("lists", lists);
        return "/admin/role/list";
    }

    @RequestMapping("/role/getDatalist.do")
    public List<Role> getDataList() {

        return null;
    }
}
