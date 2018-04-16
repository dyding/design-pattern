package com.design.pattern.strategy.pay;

import com.design.pattern.strategy.pay.payport.AliPay;

public class PayStrategyTest {

	public static void main(String[] args) {
		
		
		Order order = new Order("1","201803110010000",230.52);
		
		System.out.println(order.pay(new AliPay()));
	}
	
}
