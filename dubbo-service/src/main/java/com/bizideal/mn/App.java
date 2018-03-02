package com.bizideal.mn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        System.out.println("服务1已经启动...");
//        org.springframework.core.env.StandardEnvironment
        System.in.read();
    }
}
