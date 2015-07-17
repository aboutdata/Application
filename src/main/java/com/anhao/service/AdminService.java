/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.service;

import com.anhao.commons.page.Page;
import com.anhao.commons.page.Pageable;
import com.anhao.domain.Admin;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface AdminService {

    /**
     * 判断用户名是否存在
     *
     * @param username 用户名(忽略大小写)
     * @return 用户名是否存在
     */
    public boolean usernameExists(String username);

    /**
     * 根据用户名查找管理员
     *
     * @param username 用户名(忽略大小写)
     * @return 管理员，若不存在则返回null
     */
    public Admin findByUsername(String username);

    public void create(Admin admin);

    public List<Admin> findAll();

    public Admin findById(String id);

    public Page<Admin> findPage(Pageable pageable);

    public Page<Admin> findPage(Pageable pageable, boolean dim);

    /**
     * 更新实体对象
     *
     * @param entity 实体对象
     * @return 实体对象
     */
    public Admin update(Admin entity);

}
