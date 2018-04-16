package com.design.pattern.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibMeipo implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("我是媒婆，我要给你找对象");
		methodProxy.invokeSuper(o, objects);
		System.out.println("如果合适，就准备办事");
		return null;
	}

}
