package com.nb.beans;

public class Person {
	private String Name;
	private String Gender;
	private int Age;
	private Passport passportDetail;
	public void setName(String name) {
		Name = name;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setPassportDetail(Passport passportDetail) {
		this.passportDetail = passportDetail;
	}
	public String toString() {
		return "Person [Name=" + Name + ", Gender=" + Gender + ", Age=" + Age
				+ ", passportDetail=" + passportDetail + "]";
	}
	
	
	


}
