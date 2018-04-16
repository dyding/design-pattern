package com.design.pattern.prototype.deep;

public class Student2 implements Cloneable {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	protected Object clone() {
		Student2 stu = null;
		try {
			stu = (Student2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return stu;
	}

}
