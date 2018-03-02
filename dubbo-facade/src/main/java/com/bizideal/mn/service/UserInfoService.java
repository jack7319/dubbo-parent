package com.bizideal.mn.service;

import com.bizideal.mn.entity.UserInfo;

/**
 * @author : liulq
 * @date: 创建时间: 2017/10/24 13:11
 * @version: 1.0
 * @Description:
 */
public interface UserInfoService {

    public boolean addUserInfo(UserInfo userInfo);

    public UserInfo getById(Integer userId);
}