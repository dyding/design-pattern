package com.design.pattern.strategy.pay;

import com.design.pattern.strategy.pay.payport.PayType;

public class Order {
	
	private String uid;
	private String orderid;
	private double amount;
	public Order(String uid, String orderid, double amount) {
		super();
		this.uid = uid;
		this.orderid = orderid;
		this.amount = amount;
	}
	
	//pay函数接口中可以使用Payment这个接口代替，
	//完美地解决了switch的过程，不需要在代码逻辑中写switch
	//更不需要写if/else代码逻辑
	public PayState pay(PayType payType){
		return payType.get().pay(this.uid, amount);
	}

}
