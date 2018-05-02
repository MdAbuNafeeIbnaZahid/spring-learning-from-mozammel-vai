package com.livingoncodes.spring.springtutorial04;

public class Patient {

	private int id;
	private String name;

	private int nationalId;
	private Address address;

	public Patient() {

	}
	
	public static Patient getInstance(int id, String name)
	{
		System.out.println("Creating Patient using factory method");
		return new Patient(id, name);
	}

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate()
	{
		System.out.println( "Patient created " + this );
	}
	
	
	public void onDestroy()
	{
		System.out.println("Patient destroyed " + this);
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + ", address=" + address + "]";
	}

	public void speak() {
		System.out.println("Help me. I am a patient");
	}

}
