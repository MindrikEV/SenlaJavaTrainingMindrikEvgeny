package org.senlatraining.autoservice.util;

import java.util.List;

public class Printer {
	
	public static void print(String message){
		System.out.println(message);
	}
//----------------------------------------------------------
	public static <T> void printList(List<T> array){
		for(T a : array){
			System.out.println(a.toString());
		}
	}
//----------------------------------------------------------
	public static void printStick(){
		System.out.println("---------------------------------------------------------------");
	}
}
