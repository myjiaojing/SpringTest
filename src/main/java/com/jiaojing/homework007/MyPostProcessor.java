package com.jiaojing.homework007;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;



public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(beanName);
		Pattern p=Pattern.compile("^do.*"); 
		Matcher m=p.matcher(beanName); 
		
		if (m.matches()) {
			return createProxy(bean);
		}
		
		return bean;
	}
	
	public static<T> T createProxy(Object obj){
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new MyInterceptor(obj));
		
		return (T)enhancer.create();
		
	}

}
