package com.ILP04.entity;

public class Customer {
	private int customerCode;
	private String customerFirstname;
	private String customerLastname;
	private String address;
	private long phoneNumber;
	private long aadharNo;

	public Customer(int customerCode, String customerFirstname, String customerLastname, String address,
			long phoneNumber, long aadharNo) {
		super();
		this.customerCode = customerCode;
		this.customerFirstname = customerFirstname;
		this.customerLastname = customerLastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.aadharNo = aadharNo;
	}
    
	public Customer(String customerFirstname, String customerLastname, String address, long phoneNumber,
			long aadharNo) {
		super();
		this.customerFirstname = customerFirstname;
		this.customerLastname = customerLastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.aadharNo = aadharNo;
	}

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerFirstname() {
		return customerFirstname;
	}

	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}

	public String getCustomerLastname() {
		return customerLastname;
	}

	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

}
