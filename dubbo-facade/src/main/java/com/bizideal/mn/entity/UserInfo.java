package com.bizideal.mn.entity;

import java.io.Serializable;

/**
 * @author : liulq
 * @date: 创建时间: 2017/10/24 13:03
 * @version: 1.0
 * @Description:
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7276043468916323752L;

    private Integer userId;
    private String userName;
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
