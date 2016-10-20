package org.senlatraining.autoservice.util;

import com.danco.training.TextFileWorker;
/*
 * This class operate with files(text files) via "textFileWorker.jar" - library by Senla.
 */
public class FileWorker {
	private TextFileWorker fileWorker;
	private ArrayWorker arrayWorker = new ArrayWorker();
	
	public FileWorker(String path){												// Constructor
		fileWorker = new TextFileWorker(path);
	}
//--------------------------------------------------------------------------------	
	public void pushListToFile(Object[] array){								 	// Write to file
		Integer size = array.length;
		String[] list = new String[arrayWorker.countOfElements(array)];
		
		for(int i = 0; i < size; i++){
			if(array[i] != null){
				list[i] = array[i].toString();
			} else {
				continue;
			}
		}
		fileWorker.writeToFile(list);
	}	
//--------------------------------------------------------------------------------	
	public String[] pullFromFile(){ 											// Read from file
		return fileWorker.readFromFile();
	}
}

