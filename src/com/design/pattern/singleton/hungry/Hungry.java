package com.design.pattern.singleton.hungry;

/**
 * 饿汉式单例模式
 * 	在类加载的时候就立即初始化，并且创建对象
 * 	优点：没有任何的锁、执行效率较高
 * 	缺点：类加载时就初始化，如果用不着对象，则造成内存浪费
 * @author Rick
 *
 */
public class Hungry {

	//私有化构造方法
	private Hungry(){
		
	}
	
	private static final Hungry hungry = new Hungry();
	
	public Hungry getInstance(){
		return hungry;
	}
	
}
