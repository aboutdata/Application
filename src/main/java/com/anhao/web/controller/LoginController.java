/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 时间: 2015-7-14
 *
 * @author aboutdata
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String displayLogin(Model model) {
        logger.debug("displayLogin");
        return "/admin/login";
    }
}
