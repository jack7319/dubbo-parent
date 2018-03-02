package com.bizideal.mn.service.impl;

import com.bizideal.mn.entity.UserInfo;
import com.bizideal.mn.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : liulq
 * @date: 创建时间: 2017/10/24 13:16
 * @version: 1.0
 * @Description:
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    private static List<UserInfo> userInfos = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(i);
            userInfo.setUserName("name-" + i);
            userInfos.add(userInfo);
        }
    }

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        userInfos.add(userInfo);
        return true;
    }

    @Override
    public UserInfo getById(Integer userId) {
        System.out.println("服务2被调用");
        for (int i = 0; i < userInfos.size(); i++) {
            if (userInfos.get(i).getUserId() == userId) {
                return userInfos.get(i);
            }
        }
        return null;
    }
}
