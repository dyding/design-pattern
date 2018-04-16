package com.design.pattern.strategy.pay;

public class PayState {
	
	private int code;
	private Object data;
	private String msg;

	public PayState(int code,String msg,Object data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "状态码 [code=" + code + ", data=" + data + ",交易详情 msg=" + msg + "]";
	}

	
	
}
