package com.people;

public class Student extends Person{
	
	private String program;
	private int year;
	private double fee;
	
	//constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//getters and setters
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	

}
