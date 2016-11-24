package org.senlatraining.autoservice.util;

public class IdMaker {
	private static Integer idCounter = 0;
	private static Integer numberCounter = 0;
	
	public Integer getId(){
		return idCounter++;
	} 
//-----------------------------------------------------
	public Integer getNumber(){
		return numberCounter++;
	}
}
