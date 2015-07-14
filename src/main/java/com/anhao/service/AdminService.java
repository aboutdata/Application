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

    public void create(Admin admin);

    public List<Admin> findAll();

    public Admin findById(String id);

    public Page<Admin> findPage(Pageable pageable);

    public Page<Admin> findPage(Pageable pageable, boolean dim);
}
