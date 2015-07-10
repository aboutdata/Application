package com.anhao.domain.enums;

/**
 * 时间: 2015-7-10
 *
 * @会诊状态信息
 *
 * @author aboutdata
 */
public enum ConsultRequestStatus implements BaseEnum {

    REQUEST("REQUEST", "申请已提交"),
    CANCEL("CANCEL", "会诊已取消"),
    SCHEDULE("SCHEDULE", "已经安排医生"),
    OPENNING("OPENNING", "正在会诊中"),
    NOTREPORT("NOTREPORT", "报告未提交"),
    FINISHED("FINISHED", "会诊已完成");

    private final String key;
    private final String desc;

    private ConsultRequestStatus(String key, String desc) {
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
