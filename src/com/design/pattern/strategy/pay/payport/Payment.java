package com.design.pattern.strategy.pay.payport;

import com.design.pattern.strategy.pay.PayState;

public interface Payment {
	
	public PayState pay(String uid,double amount);

}
