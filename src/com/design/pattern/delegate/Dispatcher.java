package com.design.pattern.delegate;

public class Dispatcher implements IExector{

	IExector exector;
	
	public Dispatcher(IExector exector){
		this.exector = exector;
	}
	
	@Override
	public void doing() {
		this.exector.doing();
	}

}
