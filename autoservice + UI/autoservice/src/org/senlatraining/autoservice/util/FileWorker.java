package org.senlatraining.autoservice.util;

import com.danco.training.TextFileWorker;
import java.util.List;
import org.apache.log4j.Logger;
/*
 * This class operate with files(text files) via "textFileWorker.jar" - library by Senla.
 */
public class FileWorker {
	private static final Logger log = Logger.getLogger(FileWorker.class);
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
		
		//for(int i=0; i < fileWorker.readFromFile().length;i++){
		//	System.out.println(fileWorker.readFromFile()[i]);	
		//}
		return fileWorker.readFromFile();
	}
}

