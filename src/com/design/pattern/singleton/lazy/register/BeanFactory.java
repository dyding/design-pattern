package com.design.pattern.singleton.lazy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
	
	private BeanFactory(){
		
	}
	
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	
	public static Object getBean(String className){
		if(!ioc.containsKey(className)){
			Object obj = null;
			try {
				obj = Class.forName(className).newInstance();
				ioc.put(className, obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}else{
			return ioc.get(className);
		}
	}

}
