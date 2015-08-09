/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller;

import com.anhao.domain.enums.CaptchaType;
import com.anhao.service.CaptchaService;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 时间: 2015-7-14
 *
 * @author aboutdata
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource(name = "captchaServiceImpl")
    private CaptchaService captchaService;

    @RequestMapping(method = RequestMethod.GET)
    public String displayLogin(Model model) {
        logger.info("displayLogin ");
        return "/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(String username, String password, String captcha, HttpServletRequest request, Model model) {
        boolean captchaValid = captchaService.isValid(request.getSession().getId(), captcha);
        if (!captchaValid) {
            model.addAttribute("errorMessage", "验证码错误");
            return "/login";
        }
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            SecurityUtils.getSubject().login(token);
            return "redirect:/admin/dashboard";
        } catch (AuthenticationException e) {
            
            model.addAttribute("errorMessage", e.getMessage());
            return "/login";
        }
    }
    
    
}
