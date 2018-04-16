package com.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Father implements InvocationHandler {

	// 被代理的对象，把引用保存下来
	private Person target;

	public Object getInstance(Person target) {

		this.target = target;

		Class<?> clazz = target.getClass();

		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是你爸，我帮你找工作");

		method.invoke(this.target, args);
		System.out.println("如果合适，就去上班");

		return null;
	}

}
