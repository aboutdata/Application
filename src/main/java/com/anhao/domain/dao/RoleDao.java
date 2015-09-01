/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain.dao;

import com.anhao.commons.page.Pageable;
import com.anhao.domain.Role;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface RoleDao extends BaseDao<Role, String> {

    public int countAll();

    public Role findById(String id);

    public void create(Role role);

    public List<Role> findAll();

    public List<Role> findByPage(Pageable pageable);

    public Long countByPage();
}
