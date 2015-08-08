/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.domain.enums;

/**
 * 验证码类型
 */
public enum CaptchaType {

    /**
     * 会员登录
     */
    memberLogin,
    /**
     * 会员注册
     */
    memberRegister,
    /**
     * 后台登录
     */
    adminLogin,
    /**
     * 商品评论
     */
    review,
    /**
     * 商品咨询
     */
    consultation,
    /**
     * 找回密码
     */
    findPassword,
    /**
     * 重置密码
     */
    resetPassword,
    /**
     * 其它
     */
    other
}
