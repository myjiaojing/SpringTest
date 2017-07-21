package com.jiaojing.L011;

import org.springframework.context.ApplicationContext;


public class Test {
    public static void main(String[] args){
        //按配置文件读取顺序，如果允许覆盖，那么打印I'am ClassB！覆盖原来的I'am ClassA
        ApplicationContext applicationContext = new CustomApplicationContext(new String[]{"same-name-beans-a.xml","same-name-beans-b.xml"});

    }
}
