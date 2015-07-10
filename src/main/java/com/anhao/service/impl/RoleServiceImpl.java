package com.anhao.service.impl;

import com.anhao.domain.Role;
import com.anhao.domain.dao.RoleDao;
import com.anhao.service.RoleService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    public void create(Role role) {
        roleDao.create(role);
    }

    @Override
    public int countAll() {
        return roleDao.countAll();
    }

    @Override
    public Role findById(String id) {
        return roleDao.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

}
