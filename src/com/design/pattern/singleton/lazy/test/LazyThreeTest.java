package com.design.pattern.singleton.lazy.test;

import java.lang.reflect.Constructor;

import com.design.pattern.singleton.lazy.LazyThree;

public class LazyThreeTest {

	public static void main(String[] args) {
		Class<?> clazz = LazyThree.class;
		try {
			Constructor c = clazz.getDeclaredConstructor(null);
			c.setAccessible(true);
			Object o1 = c.newInstance();
			Object o2 = c.newInstance();
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o1 == o2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
