package com.design.pattern.prototype.simple;

import java.util.ArrayList;

public class CloneTest {

	public static void main(String[] args) {
		Prototype p = new Prototype();
		p.name = "tom";
		p.list = new ArrayList<String>();
		p.list.add("1");
		System.out.println(p);
		
		try {
			Prototype obj = (Prototype) p.clone();
			p.list.add("2");
			System.out.println(obj.list.size());
			obj.list.add("3");
			System.out.println(obj);
			System.out.println(p.list.size());
			
			System.out.println(p == obj);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}
