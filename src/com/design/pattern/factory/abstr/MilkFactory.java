package com.design.pattern.factory.abstr;

import com.design.pattern.factory.Mengniu;
import com.design.pattern.factory.Milk;
import com.design.pattern.factory.Telunsu;
import com.design.pattern.factory.Yili;

public class MilkFactory extends AbstractFactory{

	@Override
	public Milk getMengniu() {
		// TODO Auto-generated method stub
		return new Mengniu();
	}

	@Override
	public Milk getYili() {
		// TODO Auto-generated method stub
		return new Yili();
	}

	@Override
	public Milk getTelunsu() {
		// TODO Auto-generated method stub
		return new Telunsu();
	}

}
