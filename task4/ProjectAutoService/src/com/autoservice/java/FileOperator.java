package com.autoservice.java;

import com.danco.training.TextFileWorker;
/*
 * This class operate with files(text files) via "textFileWorker.jar".
 */
public class FileOperator {
	//private final String pathMaster = "Master.txt";
	//private String[] str = new String[]{"Text line 1","Text line 2"};
	private TextFileWorker fileWorker;
	
	public FileOperator(String path){
		fileWorker = new TextFileWorker(path);
	}
//-------------------------------------------------------------------------	
	public void pushToFile(String[] str){
		fileWorker.writeToFile(str);	
	}
//-------------------------------------------------------------------------	
	/*public String[] pullFromFile(){
		
	}*/
}
