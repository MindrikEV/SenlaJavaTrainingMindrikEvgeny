package com.autoservice.java;

import com.danco.training.TextFileWorker;
/*
 * This class operate with files(text files) via "textFileWorker.jar".
 */
public class FileOperator {
	private TextFileWorker fileWorker;
	private ArrayWorker arrayWorker = new ArrayWorker();
	
	public FileOperator(String path){										// Constructor
		fileWorker = new TextFileWorker(path);
	}
//-------------------------------------------------------------------------	
	public void pushToFile(String[] arrayOfStrings){						// Write to file
		fileWorker.writeToFile(arrayOfStrings);	
	}
//-------------------------------------------------------------------------	
	public String[] pullFromFile(){ 										// Read from file
		return fileWorker.readFromFile();
	}
//-------------------------------------------------------------------------	
	public void pushListToFile(Object[] array){
		Integer size = array.length;
		String[] list = new String[arrayWorker.countOfElements(array)];
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < size; i++){
			if(array[i] != null){ 
				s.append(array[i].getFirstname());
				s.append(" ");
				s.append(array[i].getLastname());
				s.append(" ");
				s.append(String.valueOf(array[i].getStatus()));
				s.append(" ");
				list[i] = s.toString();
			} else {
				continue;
			}
		}
		fileWorker.writeToFile(list);
	}	
}
