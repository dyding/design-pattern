package com.design.pattern.factory.simple;

import com.design.pattern.factory.Mengniu;
import com.design.pattern.factory.Milk;
import com.design.pattern.factory.Telunsu;
import com.design.pattern.factory.Yili;

public class SimpleFactory {
	
	public Milk getMilk(String name){
		if("����".equals(name)){
			return new Yili();
		}else if("��ţ".equals(name)){
			return new Mengniu();
		}else if("������".equals(name)){
			return new Telunsu();
		}
		return null;
	}

}
