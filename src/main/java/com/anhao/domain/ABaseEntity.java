package com.anhao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类 - 基类
 */
public class ABaseEntity implements Serializable {

    private static final long serialVersionUID = 6880611748567024709L;

    private long id;// ID
    private Date createDate;// 创建日期
    private Date modifyDate;// 修改日期

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

}
