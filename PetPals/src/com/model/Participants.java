package com.model;

public class Participants {
	private int id;
	private String participantName;
	private int event_id;
	@Override
	public String toString() {
		return "Participants [id=" + id + ", participantName=" + participantName + ", event_id=" + event_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participants(int id, String participantName, int event_id) {
		super();
		this.id = id;
		this.participantName = participantName;
		this.event_id = event_id;
	}
}
