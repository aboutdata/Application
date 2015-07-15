/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.web.controller;

import com.anhao.domain.Admin;
import com.anhao.service.AdminService;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

/**
 * 时间: 2015-7-10
 *
 * @ 集成ContextLoaderListener，而不是import javax.servlet.ServletContextListener;
 * @author aboutdata
 */
@WebListener
public class ServletListener extends ContextLoaderListener {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        long start = System.currentTimeMillis();
        logger.info("contextInitialized start ...");
        //获取spring上下文
        ApplicationContext applicationContext = getCurrentWebApplicationContext();
        AdminService adminService = (AdminService) applicationContext.getBean("adminServiceImpl");
        for (Admin admin : adminService.findAll()) {
            logger.info("admin {}", admin);
        }
        logger.info("contextInitialized {}", System.currentTimeMillis() - start);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
