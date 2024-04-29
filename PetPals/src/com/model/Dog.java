package com.model;

public class Dog extends Pet {
	private int petId;
	private String Dogbreed;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(int id, String name, int age, String breed, String isavailable) {
		super(id, name, age, breed, isavailable);
		// TODO Auto-generated constructor stub
	}
	public Dog(int petId, String dogbreed) {
		super();
		this.petId = petId;
		Dogbreed = dogbreed;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getDogbreed() {
		return Dogbreed;
	}
	public void setDogbreed(String dogbreed) {
		Dogbreed = dogbreed;
	}
	@Override
	public String toString() {
		return "Dog [petId=" + petId + ", Dogbreed=" + Dogbreed + "]";
	}

}
