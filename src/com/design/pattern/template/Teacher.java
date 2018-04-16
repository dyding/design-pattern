package com.design.pattern.template;

public class Teacher extends AbstractPerson{

	@Override
	protected void dressup() {
		System.out.println("穿工作服");
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("吃早饭");
	}

	@Override
	protected void takeThings() {
		System.out.println("带备课记录");
	}

}
