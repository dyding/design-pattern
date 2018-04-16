package com.design.pattern.template;

public abstract class AbstractPerson {
	
	public void prepareGotoSchool(){
		dressup();
		eatBreakfast();
		takeThings();
	}
	
	protected abstract void dressup();
	
	protected abstract void eatBreakfast();
	
	protected abstract void takeThings();

}
