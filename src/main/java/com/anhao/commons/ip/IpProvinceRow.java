/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.commons.ip;

/**
 *
 * @author Administrator
 */
public class IpProvinceRow extends RangeRow<Long, String> {

    private static final long serialVersionUID = 8411106544005822554L;

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
