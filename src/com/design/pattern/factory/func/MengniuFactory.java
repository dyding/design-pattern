package com.design.pattern.factory.func;

import com.design.pattern.factory.Mengniu;
import com.design.pattern.factory.Milk;

public class MengniuFactory implements Factory{

	@Override
	public Milk getMilk() {
		// TODO Auto-generated method stub
		return new Mengniu();
	}

}
