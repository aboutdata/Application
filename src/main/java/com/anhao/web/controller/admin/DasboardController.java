/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller.admin;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 时间: 2015-7-15
 *
 * @author aboutdata
 */
@Controller
@RequestMapping("/admin")
public class DasboardController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/dashboard")
    public String displayDasboard(Model model) {
        logger.debug("displayDasboard...");
        return "/admin/dashboard";
    }
}
