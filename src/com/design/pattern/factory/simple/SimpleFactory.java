package com.design.pattern.factory.simple;

import com.design.pattern.factory.Mengniu;
import com.design.pattern.factory.Milk;
import com.design.pattern.factory.Telunsu;
import com.design.pattern.factory.Yili;

public class SimpleFactory {
	
	public Milk getMilk(String name){
		if("раюШ".equals(name)){
			return new Yili();
		}else if("циеё".equals(name)){
			return new Mengniu();
		}else if("льбьку".equals(name)){
			return new Telunsu();
		}
		return null;
	}

}
