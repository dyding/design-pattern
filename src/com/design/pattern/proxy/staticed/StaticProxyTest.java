package com.design.pattern.proxy.staticed;
/**
 * 静态代理的特点就是：
 * 在代理对象运行之前就已经知道具体的方法
 * 
 * 而动态代理在运行时才拿到被代理对象的方法
 * @author Rick
 *
 */
public class StaticProxyTest {
	
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}

}
