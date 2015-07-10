package com.anhao.domain.enums;

/**
 * 时间: 2015-7-10
 *
 * @病人付费类别字典
 * @1	城镇职工基本医疗保险	CZZGJBYLBX
 * @2	城镇居民基本医疗保险	CZJMJBYLBX
 * @3	新型农村合作医疗	XXNCHZYL
 * @4	贫困救助	PKJZ
 * @5	商业医疗保险	SYYLBX
 * @6	全公费	QGF
 * @7	全自费	QZF
 * @8	其他社会保险 QTSHBX
 * @9	其他	QT 10 非本院	FBY 11	外宾	WB 12	本院	BY
 *
 * @author aboutdata
 */
public enum PatientFeeType implements BaseEnum {

    CZZGJBYLBX("CZZGJBYLBX", "城镇职工基本医疗保险"),
    CZJMJBYLBX("CZJMJBYLBX", "城镇居民基本医疗保险"),
    XXNCHZYL("XXNCHZYL", "新型农村合作医疗"),
    PKJZ("PKJZ", "贫困救助"),
    SYYLBX("SYYLBX", "商业医疗保险"),
    QGF("QGF", "全公费"),
    QZF("QZF", "全自费"),
    QTSHBX("QTSHBX", "其他社会保险"),
    QT("QT", "其他"),
    FBY("FBY", "非本院"),
    WB("WB", "外宾"),
    BY("BY", "本院");

    private final String key;
    private final String desc;

    private PatientFeeType(String key, String desc) {
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
