package com.nb.beans;

public class Passport {
	private String PassportNo;
	private int validity;
	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String toString() {
		return "Passport [PassportNo=" + PassportNo + ", validity=" + validity
				+ "]";
	}
	

}
