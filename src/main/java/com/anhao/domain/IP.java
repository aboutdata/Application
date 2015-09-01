/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain;

import java.io.Serializable;

/**
 * CREATE TABLE `ip_address` ( `id` int(11) unsigned zerofill NOT NULL
 * AUTO_INCREMENT, `start_ip` varchar(50) DEFAULT NULL, `end_ip` varchar(50)
 * DEFAULT NULL, `province_city` varchar(50) DEFAULT NULL, `area` varchar(255)
 * DEFAULT NULL, PRIMARY KEY (`id`), KEY `index_start_ip` (`start_ip`), KEY
 * `index_end_ip` (`end_ip`) ) ENGINE=InnoDB AUTO_INCREMENT=444071 DEFAULT
 * CHARSET=utf8;
 *
 * @author Administrator
 */
public class IP implements Serializable {

    private int id;
    private String start;
    private String end;
    private String province;
    private String area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "IP{" + "id=" + id + ", start=" + start + ", end=" + end + ", province=" + province + ", area=" + area + '}';
    }
    

}
