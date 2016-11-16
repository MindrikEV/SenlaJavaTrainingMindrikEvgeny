package org.senlatraining.autoservice.util;

import java.util.List;

public class Printer {
	
	public void print(String message){
		System.out.println(message);
	}
//----------------------------------------------------------
	public <T> void printList(List<T> array){
		for(T a : array){
			System.out.println(a.toString());
		}
	}
//----------------------------------------------------------
	public void printStick(){
		System.out.println("---------------------------------------------------------------");
	}
}
