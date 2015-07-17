/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.test;

import com.anhao.domain.Admin;
import com.anhao.domain.Role;
import com.anhao.domain.dao.RoleDao;
import com.anhao.service.AdminService;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 时间: 2015-7-15
 *
 * @author aboutdata
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/spring-context.xml")
public class DemoTest extends AbstractJUnit4SpringContextTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private AdminService adminService;

    @Resource
    private RoleDao roleDao;

    /**
     * 默认提供测试方法
     */
    public void empty() {

    }

    /**
     * *
     * 测试 查询所有管理员
     */
    @Test
    @Ignore
    public void findAdminsTest() {
        List<Admin> list = adminService.findAll();
        for (Admin admin : list) {
            logger.info("admin {}", admin);
        }
    }

    /**
     * 测试插入一条数据到v_role表
     */
//    @Test
    @Ignore
    public void saveRoleTest() {

        Role role = new Role();

        role.setId(33l);
        role.setCreateDate(new Date());
        role.setModifyDate(new Date());
        role.setDescription("我要在测试一次");
        role.setIsSystem(Boolean.TRUE);
        role.setName("王坤");
        role.setValue("ROLE_TEST");
        logger.info("role save {}", role);
        roleDao.create(role);
    }
}
