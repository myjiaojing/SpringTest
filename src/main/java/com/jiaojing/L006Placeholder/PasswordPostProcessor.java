package com.jiaojing.L006Placeholder;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;

public class PasswordPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        MutablePropertyValues propertyValues = beanFactory.getBeanDefinition("phtest").getPropertyValues();
        PropertyValue encryPassWordObj = propertyValues.getPropertyValue("password");
        if (encryPassWordObj == null || encryPassWordObj.getValue() == null) {
            return;
        }
        String encryPassword = ((TypedStringValue) encryPassWordObj.getValue()).getValue();
        //解密：把34换成999
        String realPassword = encryPassword.replace("34", "999");
        propertyValues.add("password", realPassword);
    }
}
