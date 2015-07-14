/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.commons.page;

import com.anhao.commons.BaseObject;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//import org.codehaus.jackson.annotate.JsonTypeInfo;
/**
 *
 * @author keven
 * @param <T>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class TableData<T> extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    private int sEcho;

    private long iTotalRecords;

    private long iTotalDisplayRecords;

    private List<T> aaData;

    public TableData() {
    }

    public TableData(final Page<T> pages, int sEcho) {
        aaData = pages.getContent();
        iTotalRecords = pages.getTotal();
        iTotalDisplayRecords = pages.getTotal();
        this.sEcho = sEcho + 1;
    }

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public long getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(long iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public long getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(long iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public List<T> getAaData() {
        return aaData;
    }

    public void setAaData(List<T> aaData) {
        this.aaData = aaData;
    }

}
