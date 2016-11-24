package org.senlatraining.ui.util;

import java.util.List;

import org.apache.log4j.Logger;

public class Printer {
	private static final Logger log = Logger.getLogger(Printer.class);
		
	public static void print(Object message){
		System.out.print(message);
	}
//----------------------------------------------------------
	public static void println(Object message){
		System.out.println(message);
	}
//----------------------------------------------------------
	public static <T> void printList(List<T> array){
		try {
			for(T a : array){
				System.out.println(a.toString());
			}
		} catch (NullPointerException e){
			log.error(e);
		}	
	}
//----------------------------------------------------------
	public static <T> void printMenu(List<T> array){
		StringBuilder s = new StringBuilder();
		try {
			for(int i=0; i < array.size();i++)
			{
				s.append(i+1);
				s.append(". ");
				s.append(array.get(i).toString());
				System.out.println(s);
				s.setLength(0);
			}
		} catch (NullPointerException e){
			log.error(e);
		}	
	}
//----------------------------------------------------------
	public static void printStick(){
		System.out.println("---------------------");
	}
}
