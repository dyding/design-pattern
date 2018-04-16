package com.design.pattern.proxy.staticed;

public class Father {
	//要有被代理对象的引用
	private Son son;
	public Father(Son son){
		this.son = son;
	}
	public void findLove(){
		System.out.println("根据你的要求找对象");
		son.findLove();
		System.out.println("找到一个对象");
	}

}
