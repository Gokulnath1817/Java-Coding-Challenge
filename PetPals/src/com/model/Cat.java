package com.model;

public class Cat extends Pet {
	private int petId;
	private int catColor;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(int id, String name, int age, String breed, String isavailable) {
		super(id, name, age, breed, isavailable);
		// TODO Auto-generated constructor stub
	}
	public Cat(int petId, int catColor) {
		super();
		this.petId = petId;
		this.catColor = catColor;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getCatColor() {
		return catColor;
	}
	public void setCatColor(int catColor) {
		this.catColor = catColor;
	}
	
	
}
