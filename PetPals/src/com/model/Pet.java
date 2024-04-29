package com.model;

public class Pet {
	private int id;
	private String name;
	private int age;
	private String breed;
	private String isavailable;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(int id, String name, int age, String breed, String isavailable) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.isavailable = isavailable;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getIsavailable() {
		return isavailable;
	}
	public void setIsavailable(String isavailable) {
		this.isavailable = isavailable;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", isavailable=" + isavailable
				+ "]";
	}
	
	}
