package com.design.pattern.proxy.dynamic.cglib;

public class CglibTest {
	
	public static void main(String[] args) {
		
		try{
			Zhangsan obj = (Zhangsan) new CglibMeipo().getInstance(Zhangsan.class);
			obj.findLove();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
