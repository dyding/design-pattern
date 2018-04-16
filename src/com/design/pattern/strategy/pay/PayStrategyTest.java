package com.design.pattern.strategy.pay;

import com.design.pattern.strategy.pay.payport.PayType;

public class PayStrategyTest {
	
	public static void main(String[] args) {
		Order order = new Order("1","2018031101000",231.35);
		
		System.out.println(order.pay(PayType.JD_PAY));
		
		
	}

}
