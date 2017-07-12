package com.jiaojing.L010;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("convertBeans.xml");
		 Member member = (Member) ac.getBean("member");
		 
		 System.out.println(member.getCode()[0]);
		
		 Team team = (Team) ac.getBean("team");
		 List<Member> m = team.getNames();
		 
		 for (Member member2 : m) {
			System.out.println(member2.getName());
		}
		
	}

}
