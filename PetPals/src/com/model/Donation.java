package com.model;

public  class Donation {
	private int id;
	private String donorName;
	private double amount;
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donation(int id, String donorName, double amount) {
		super();
		this.id = id;
		this.donorName = donorName;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Donation [id=" + id + ", donorName=" + donorName + ", amount=" + amount + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


}
