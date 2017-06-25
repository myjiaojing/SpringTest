package com.jiaojing.homework007;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor {
	
	Object traget;
	
	public MyInterceptor(Object traget) {
		
		this.traget = traget;
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("方法运行前前前前前前前前前前前前前前前前前");
		Object result = method.invoke(traget, args);
		System.out.println("方法运行后后后后后后后后后后后后后后后后");
		return result;
	}

}
