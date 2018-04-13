package com.design.pattern.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		//对于用户来说，需要知道配置具体的工厂才能得到具体的产品
		Factory factory = new MengniuFactory();
		System.out.println(factory.getMilk());
	}

}
