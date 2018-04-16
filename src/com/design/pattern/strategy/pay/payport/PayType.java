package com.design.pattern.strategy.pay.payport;

public enum PayType {

	Ali_PAY(new AliPay()), 
	WECHAT_PAY(new Wechat()), 
	JD_PAY(new JdPay()), 
	UNION_PAY(new UnionPay());

	private Payment payment;

	PayType(Payment payment) {
		this.payment = payment;
	}

	public Payment get() {
		return this.payment;
	}

}
