/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain.dao;

import com.anhao.domain.Admin;
import java.util.List;
import java.util.Map;

/**
 * 管理员DAO
 *
 * @author Administrator
 */
public interface AdminDao extends BaseDao<Admin, String> {

    public void create(Admin admin);

    public List<Admin> findAll();

    public List<Admin> findByPage(Map map);

    public Long countByPage();

    public boolean usernameExists(String username);

    public Admin findByUsername(String username);

    public Admin update(Admin entity);
}
