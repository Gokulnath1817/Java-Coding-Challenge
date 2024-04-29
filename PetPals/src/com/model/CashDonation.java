package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.utility.DBConnection;

public class CashDonation extends Donation {
	private int donation_id;
	private String donationDate;
	@Override
	public String toString() {
		return "CashDonation [donatio_id=" + donation_id + ", donationDate=" + donationDate + "]";
	}
	public int getDonation_id() {
		return donation_id;
	}
	public void setDonation_id(int donatio_id) {
		this.donation_id = donatio_id;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public CashDonation(int id, String donorName, double amount, int donation_id, String donationDate) {
		super(id, donorName, amount);
		this.donation_id = donation_id;
		this.donationDate = donationDate;
	}
	public CashDonation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CashDonation(int id, String donorName, double amount) {
		super(id, donorName, amount);
		// TODO Auto-generated constructor stub
	}
}
