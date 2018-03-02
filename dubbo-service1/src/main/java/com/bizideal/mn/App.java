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
//        com.alibaba.dubbo.rpc.cluster.LoadBalance
        System.out.println("服务2已经启动...");
        System.in.read();
    }
}
