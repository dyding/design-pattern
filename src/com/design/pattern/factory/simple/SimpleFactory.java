package com.design.pattern.factory.simple;

import com.design.pattern.factory.Mengniu;
import com.design.pattern.factory.Milk;
import com.design.pattern.factory.Telunsu;
import com.design.pattern.factory.Yili;

public class SimpleFactory {
	
	public Milk getMilk(String name){
		if("伊利".equals(name)){
			return new Yili();
		}else if("蒙牛".equals(name)){
			return new Mengniu();
		}else if("特仑苏".equals(name)){
			return new Telunsu();
		}
		return null;
	}

}
