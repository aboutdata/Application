/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.service;

import com.anhao.domain.Role;
import java.util.List;

/**
 * 功能主要测试mybatis service不实现
 *
 * @author Administrator
 */
public interface RoleService {

    public int countAll();

    public Role findById(String id);

    public void create(Role role);

    public List<Role> findAll();

}
