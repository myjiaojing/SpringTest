package com.jiaojing.homework007;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        
        DoSomething model1 = (DoSomething) ac.getBean("dosomething");
        
        
        model1.print();
	}

}
