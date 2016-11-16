package org.senlatraining.ui.util;

import java.util.List;

import org.apache.log4j.Logger;

public class Printer {
	private static final Logger log = Logger.getLogger(Printer.class);
		
	public void print(String message){
		System.out.print(message);
	}
//----------------------------------------------------------
	public void println(String message){
		System.out.println(message);
	}
//----------------------------------------------------------
	public <T> void printList(List<T> array){
		try {
			for(T a : array){
				System.out.println(a.toString());
			}
		} catch (NullPointerException e){
			log.error(e);
		}	
	}
//----------------------------------------------------------
	public <T> void printMenu(List<T> array){
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
	public void printStick(){
		System.out.println("---------------------");
	}
}
