package com.model;

public class PetShelter {
	private int id;
	private String name;
	private int petId;
	@Override
	public String toString() {
		return "PetShelter [id=" + id + ", name=" + name + ", petId=" + petId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public PetShelter(int id, String name, int petId) {
		super();
		this.id = id;
		this.name = name;
		this.petId = petId;
	}
	public PetShelter() {
		super();
		// TODO Auto-generated constructor stub
	}
}
