package com.anhao.domain.dao;

import java.io.Serializable;
/**
 *
 * @author Administrator
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * 根据ID获取实体对象.
     *
     * @param id 记录ID
     * @return 实体对象
     */
    public T get(PK id);

}
