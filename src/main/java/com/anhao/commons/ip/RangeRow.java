/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.commons.ip;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class RangeRow<T extends Comparable, V> implements Serializable {

    private static final long serialVersionUID = -289623726849550889L;
    private T begin;
    private T end;
    private V value;
    private Object attachment;

    public T getBegin() {
        return begin;
    }

    public void setBegin(T begin) {
        this.begin = begin;
    }

    public T getEnd() {
        return end;
    }

    public void setEnd(T end) {
        this.end = end;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

}
