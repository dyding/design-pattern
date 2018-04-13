package com.design.pattern.factory.abstr;

import com.design.pattern.factory.Milk;
/**
 * 抽象工厂
 * 用户不需要关心工厂，只需调用API就可以了
 * @author Rick
 *
 */
public abstract class AbstractFactory {
	
	public abstract Milk getMengniu();
	
	public abstract Milk getYili();
	
	public abstract Milk getTelunsu();
	

}
