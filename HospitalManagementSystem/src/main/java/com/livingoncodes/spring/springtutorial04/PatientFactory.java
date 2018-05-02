package com.livingoncodes.spring.springtutorial04;

public class PatientFactory {
	public Patient createPatient(int id, String name)
	{
		System.out.println("Using factory class to create patient");
		return new Patient(id, name);
	}
}
