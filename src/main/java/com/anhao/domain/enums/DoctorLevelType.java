package com.anhao.domain.enums;

/**
 * 时间: 2015-7-10
 *
 * @author aboutdata
 */
public enum DoctorLevelType implements BaseEnum {

    MASTER("director physician", "主任医师"),
    CZJMJBYLBX("assistant director physician", "副主任医师"),
    XXNCHZYL("doctor in charge of a case", "主治医师"),
    PKJZ("physician", "医师(住院医师)"),
    SYYLBX("Professor", "教授"),
    QGF("assistant Professor", "副教授"),
    QZF("lecturer  ", "讲师"),
    QTSHBX("teaching a istant", "助教"),
    OTHER("OTHER", "其他");

    private final String key;
    private final String desc;

    private DoctorLevelType(String key, String desc) {
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
