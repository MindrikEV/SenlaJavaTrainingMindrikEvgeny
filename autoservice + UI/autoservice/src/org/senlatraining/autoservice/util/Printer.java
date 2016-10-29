package org.senlatraining.autoservice.util;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	public void printMessage(String message){
		System.out.println(message);
	}
//----------------------------------------------------------	
/*	public void printArray(Object[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				System.out.println(array[i].toString());
			}
		}
	}*/
//----------------------------------------------------------
	public void printList(List<Object> array){
		/*for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				System.out.println(array[i].toString());
			}
		}*/
		for(Object o : array){
			System.out.println(o);
		}
	}
}
