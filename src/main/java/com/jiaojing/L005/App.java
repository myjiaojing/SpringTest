package com.jiaojing.L005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        final ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        
        Model model1 = (Model) ac.getBean("myModel");
        Model model2 = (Model) ac.getBean("myModel");
        
        System.out.println("主线程两个对象一样：" + (model1 == model2));
        new Thread(() -> {
            Model model3 = (Model) ac.getBean("myModel");
            Model model4 = (Model) ac.getBean("myModel");
            System.out.println("线程一：model3=" + System.identityHashCode(model3));
            System.out.println("线程一：model4=" + System.identityHashCode(model4));
        }).start(); 

        new Thread(() -> {
            Model model5 = (Model) ac.getBean("myModel");
            System.out.println("线程二：model5=" + System.identityHashCode(model5));
        }).start();

    }
}
