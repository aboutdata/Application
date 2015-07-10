/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain.enums;

/**
 * 时间: 2015-7-10
 *
 * @author aboutdata
 */
public enum NationalType implements BaseEnum {

    HA("HA", "汉族"),
    MG("MG", "蒙古族"),
    HU("HU", "回族"),
    ZA("ZA", "藏族"),
    UG("UG", "维吾尔族"),
    MH("MH", "苗族"),
    YI("YI", "彝族"),
    ZH("ZH", "壮族"),
    BY("BY", "布依族"),
    CS("CS", "朝鲜族"),
    MA("MA", "满族"),
    DO("DO", "侗族"),
    YA("YA", "瑶族"),
    BA("BA", "白族"),
    TJ("TJ", "土家族"),
    HN("HN", "哈尼族"),
    KZ("KZ", "哈萨克族"),
    DA("DA", "傣族"),
    LI("LI", "黎族"),
    LS("LS", "傈僳族"),
    VA("VA", "佤族"),
    GS("GS", "高山族"),
    LH("LH", "拉祜族"),
    SU("SU", "水族"),
    NX("NX", "纳西族"),
    JP("JP", "景颇族"),
    KG("KG", "柯尔克孜族"),
    TU("TU", "土族"),
    DU("DU", "达斡尔族"),
    ML("ML", "仫佬族"),
    QI("QI", "羌族"),
    BL("BL", "布朗族"),
    SL("SL", "撒拉族"),
    DX("DX", "东乡族"),
    MN("MN", "毛南族"),
    GL("GL", "仡佬族"),
    XB("XB", "锡伯族"),
    AC("AC", "阿昌族"),
    PM("PM", "普米族"),
    TA("TA", "塔吉克族"),
    NU("NU", "怒族"),
    UZ("UZ", "乌孜别克族"),
    RS("RS", "俄罗斯族"),
    EW("EW", "鄂温克族"),
    DE("DE", "德昂族"),
    BN("BN", "保安族"),
    YG("YG", "裕固族"),
    GI("GI", "京族"),
    TT("TT", "塔塔尔族"),
    DR("DR", "独龙族"),
    OR("OR", "鄂伦春族"),
    HZ("HZ", "赫哲族"),
    MB("MB", "门巴族"),
    LB("LB", "珞巴族"),
    JN("JN", "基诺族");

    private final String key;
    private final String desc;

    private NationalType(String key, String desc) {
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
