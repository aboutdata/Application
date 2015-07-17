package com.anhao.commons.bean;

import com.anhao.domain.Admin;

/**
 * 2015-7-16
 *
 * @author aboutdata
 */
public class AdminLoginResult {

    private static final long serialVersionUID = 20130925L;
    private LoginResult result;

    private Admin admin;
    private int failedAttempts;

    public AdminLoginResult(LoginResult result) {

    }

    public LoginResult getResult() {
        return result;
    }

    public void setResult(LoginResult result) {
        this.result = result;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

}
