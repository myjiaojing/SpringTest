package com.jiaojing.L011;

import org.springframework.context.ApplicationContext;


public class Test {
    public static void main(String[] args){

    	ApplicationContext applicationContext = new CustomApplicationContext(new String[]{"same-name-beans-a.xml","same-name-beans-b.xml"});

    }
}
