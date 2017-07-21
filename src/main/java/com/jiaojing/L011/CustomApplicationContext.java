package com.jiaojing.L011;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomApplicationContext extends ClassPathXmlApplicationContext {

    public CustomApplicationContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        beanFactory.setAllowBeanDefinitionOverriding(false);
    }
}
