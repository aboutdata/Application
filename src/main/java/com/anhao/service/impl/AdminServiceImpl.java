package com.anhao.service.impl;

import com.anhao.commons.page.Page;
import com.anhao.commons.page.Pageable;
import com.anhao.commons.security.dimmer.AdminDimmer;
import com.anhao.domain.Admin;
import com.anhao.domain.Role;
import com.anhao.domain.dao.AdminDao;
import com.anhao.domain.dao.RoleDao;
import com.anhao.service.AdminService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 时间: 2015-7-14
 *
 * @管理员业务实现
 *
 * @author aboutdata
 */
@Service
public class AdminServiceImpl implements AdminService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RoleDao roleDao;

    @Resource
    private AdminDao adminDao;

    @Override
    public void create(Admin admin) {
        logger.info("persist admin {}", admin);
        adminDao.create(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin findById(String id) {
        return adminDao.get(id);
    }

    /**
     * @分页查找 @param pageable
     * @return
     */
    @Override
    public Page<Admin> findPage(Pageable pageable) {

        Map pageMap = new HashMap();

        Long total = adminDao.countByPage();
        //增加分页实现
        pageMap.put("pageable", pageable);
        List<Admin> list = adminDao.findByPage(pageMap);

        for (Admin admin : list) {
            logger.debug("role {}", admin);
        }

        int totalPages = (int) Math.ceil((double) total / (double) pageable.getPageSize());
        if (totalPages < pageable.getPageNumber()) {
            pageable.setPageNumber(totalPages);
        }
        // 先计算出总条数和分页出的数据病返回
        return new Page<Admin>(list, total, pageable);
    }

    /**
     * @分页查找 @param pageable
     * @param dim
     * @return
     */
    @Override
    public Page<Admin> findPage(Pageable pageable, boolean dim) {

        Map pageMap = new HashMap();

        Long total = adminDao.countByPage();
        //增加分页实现
        pageMap.put("pageable", pageable);

        List<Admin> list = adminDao.findByPage(pageMap);

        //是否需要隐藏用户的关键信息
        if (dim) {
            List<Admin> dimlist = new ArrayList<Admin>();
            for (Admin admin : list) {
                dimlist.add(AdminDimmer.dim(admin));
            }
            //把手机号码和邮件信息模糊之后返回
            list = dimlist;
        }

        int totalPages = (int) Math.ceil((double) total / (double) pageable.getPageSize());
        if (totalPages < pageable.getPageNumber()) {
            pageable.setPageNumber(totalPages);
        }
        // 先计算出总条数和分页出的数据病返回
        return new Page<Admin>(list, total, pageable);
    }

}
