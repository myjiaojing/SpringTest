package com.jiaojing.L005;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import com.jiaojing.L005.ThreadScopeBeanDefinitionParser;

public class ThreadScopeHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("thread", new ThreadScopeBeanDefinitionParser());
    }

}
