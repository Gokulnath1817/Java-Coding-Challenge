package com.model;

public class ItemDonation extends Donation{
	private String donationid;

	@Override
	public String toString() {
		return "ItemDonation [donationid=" + donationid + ", itemType=" + itemType + "]";
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getDonationid() {
		return donationid;
	}

	public void setDonationid(String donationid) {
		this.donationid = donationid;
	}

	public ItemDonation(int id, String donorName, double amount, String donationid, String itemType) {
		super(id, donorName, amount);
		this.donationid = donationid;
		this.itemType = itemType;
	}

	public ItemDonation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDonation(int id, String donorName, double amount) {
		super(id, donorName, amount);
		// TODO Auto-generated constructor stub
	}

	private String itemType;

}
