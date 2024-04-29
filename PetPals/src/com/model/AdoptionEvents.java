package com.model;

public class AdoptionEvents {
	private int eventId;
	private String event_name;
	private  String Date;
	@Override
	public String toString() {
		return "AdoptionEvents [eventId=" + eventId + ", event_name=" + event_name + ", Date=" + Date + "]";
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public AdoptionEvents(int eventId, String event_name, String date) {
		super();
		this.eventId = eventId;
		this.event_name = event_name;
		Date = date;
	}
	public AdoptionEvents() {
		super();
		// TODO Auto-generated constructor stub
	}
}
