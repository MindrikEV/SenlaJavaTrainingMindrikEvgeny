package org.senlatraining.autoservice.util;

public class Printer {
	
	public void printMessage(String message){
		System.out.println(message);
	}
//----------------------------------------------------------	
	public void printArray(Object[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				System.out.println(array[i].toString());
			}
		}
	}
}
