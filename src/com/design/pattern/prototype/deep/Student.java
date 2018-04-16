package com.design.pattern.prototype.deep;

public class Student implements Cloneable{
	
	private int number;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	protected Object clone(){
		Student stu = null;
		try {
			stu = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stu.address = (Address) address.clone();
		
		return stu;
	}
	
	

}
