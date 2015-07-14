package com.anhao.service.impl;

import com.anhao.commons.page.Page;
import com.anhao.commons.page.Pageable;
import com.anhao.domain.Role;
import com.anhao.domain.dao.RoleDao;
import com.anhao.service.RoleService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class RoleServiceImpl implements RoleService {
    
    Logger logger = LoggerFactory.getLogger(getClass());
    
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
    
    public Page<Role> findPage(Pageable pageable) {
        
        Map pageMap = new HashMap();
        
        Long total = roleDao.countByPage();
        //增加分页实现
        pageMap.put("pageable", pageable);
        List<Role> list = roleDao.findByPage(pageMap);
        
        for (Role role : list) {
            logger.debug("role {}", role);
        }
        
        int totalPages = (int) Math.ceil((double) total / (double) pageable.getPageSize());
        if (totalPages < pageable.getPageNumber()) {
            pageable.setPageNumber(totalPages);
        }
        // 先计算出总条数和分页出的数据病返回
        return new Page<Role>(list, total, pageable);
    }
    
}
