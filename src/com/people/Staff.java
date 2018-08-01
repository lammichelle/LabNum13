package com.people;

public class Staff extends Person {
	
	private String school;
	private double pay;
	
	//constructor
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//getter setter
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return super.toString()+ "Staff [school=" + school + ", pay=" + pay + "]";
	}
	
	
	
	

}
