/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao;

import com.anhao.domain.Admin;
import com.anhao.service.AdminService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 时间: 2015-7-15
 *
 * @ 系统公有bean
 * @author aboutdata
 */
@Component
public class ApplicationBean {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private AdminService adminService;

    public Admin getAdminById(String id) {
        Admin admin = adminService.findById(id);
        logger.info("getAdminById {}", admin);
        return admin;
    }

}
