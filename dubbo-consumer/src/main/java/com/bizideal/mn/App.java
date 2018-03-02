package com.bizideal.mn;

import com.bizideal.mn.entity.UserInfo;
import com.bizideal.mn.service.UserInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        System.out.println("服务已经启动...");
        UserInfoService userInfoService = (UserInfoService) context.getBean("userInfoService");
        for (int i = 0;i<10;i++){
            boolean b = userInfoService.addUserInfo(new UserInfo());
            UserInfo byId = userInfoService.getById(3);
//            System.out.println(b);
            System.out.println(byId);
        }
        System.out.println("ok....");
        context.stop();
    }
}
