package com.design.pattern.strategy.pay;

import com.design.pattern.strategy.pay.payport.Payment;

public class Order {
	
	private String uid;
	private String orderId;
	private double amount;
	public Order(String uid, String orderId, double amount) {
		super();
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public PayState pay(Payment payment){
		return payment.pay(uid, amount);
	}

}
