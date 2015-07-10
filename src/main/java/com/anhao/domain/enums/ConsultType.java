/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain.enums;

/**
 * 时间: 2015-7-10
 *
 * @会诊类型
 * @author aboutdata
 */
public enum ConsultType implements BaseEnum {

    PUBLIC("PUBLIC", "普通会诊"),
    EMERGENCY("EMERGENCY", "紧急会诊");

    private final String key;
    private final String desc;

    private ConsultType(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }
}
