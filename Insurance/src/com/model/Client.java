package com.model;

public class Client {
	private int clientId;
    private String name;
    private String contact;
    private int policyId;
    private int userId;

    @Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", contact=" + contact + ", policyId=" + policyId
				+ ", userId=" + userId + "]";
	}

	public Client(int clientId, String name, String contact, int policyId, int userId) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.contact = contact;
		this.policyId = policyId;
		this.userId = userId;
	}

	public Client() {
		super();
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contactInfo) {
		this.contact = contactInfo;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}