package task3_4;

public class Man {
	private String name;
	private String surName;
	
	public Man(String name, String surName){
		this.name = name;
		this.surName = surName;
	}
//------------------------------------------------------	
	public void setName(String name){
		this.name = name;
	}
//------------------------------------------------------	
	public String getName(){
		return this.name;
	}
//------------------------------------------------------	
	public void setSurName(String surName){
		this.surName = surName;
	}
//------------------------------------------------------	
	public String getSurName(){
		return this.surName;
	}
}
