package com.jiaojing.L006Placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		 PhtestModle modle = (PhtestModle)ac.getBean("phtest");
	        System.out.println("最后结果为："+modle.getPassword());
		
	}

}
