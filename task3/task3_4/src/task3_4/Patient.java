package task3_4;

public class Patient extends Man{
	private String illness;
	
	public Patient(String name, String surName, String illness){
		super(name, surName);
		this.illness = illness;
	}
}
