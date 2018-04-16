package com.design.pattern.strategy.pay.payport;

import com.design.pattern.strategy.pay.PayState;

public class JdPay implements Payment {

	@Override
	public PayState pay(String uid, double amount) {
		System.out.println("欢迎使用京东支付");
		System.out.println("直接从京东卡扣款");

		return new PayState(200,"支付成功",amount);
	}

}
