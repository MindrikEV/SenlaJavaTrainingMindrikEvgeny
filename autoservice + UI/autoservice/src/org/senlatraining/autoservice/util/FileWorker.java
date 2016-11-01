package org.senlatraining.autoservice.util;

import com.danco.training.TextFileWorker;
import java.util.List;
/*
 * This class operate with files(text files) via "textFileWorker.jar" - library by Senla.
 */
public class FileWorker {
	private TextFileWorker fileWorker;
	
	public FileWorker(String path){												// Constructor
		fileWorker = new TextFileWorker(path);
	}
//--------------------------------------------------------------------------------	
	public <T> void pushListToFile(List<T> array){								 	// Write to file
		String[] list = new String[array.size()];
		
		for(int i = 0; i < array.size(); i++){
			list[i] = array.get(i).toString();
		}
		fileWorker.writeToFile(list);
	}	
//--------------------------------------------------------------------------------	
	public String[] pullFromFile(){ 											// Read from file
		return fileWorker.readFromFile();
	}
}

