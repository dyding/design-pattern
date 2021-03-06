package com.design.pattern.strategy.pay.payport;

import com.design.pattern.strategy.pay.PayState;

public class AliPay implements Payment{

	@Override
	public PayState pay(String uid, double amount) {
		
		System.out.println("欢迎使用支付宝支付");
		System.out.println("开始支付");
		
		return new PayState(200,"支付成功",amount);
	}

}
