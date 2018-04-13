package com.design.pattern.factory.func;

import com.design.pattern.factory.Milk;
import com.design.pattern.factory.Telunsu;

public class TelunsuFactory implements Factory{

	@Override
	public Milk getMilk() {
		// TODO Auto-generated method stub
		return new Telunsu();
	}

}
