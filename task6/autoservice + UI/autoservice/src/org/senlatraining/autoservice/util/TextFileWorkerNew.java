package org.senlatraining.autoservice.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class TextFileWorkerNew {
	private static final Logger log = Logger.getLogger(TextFileWorkerNew.class);
	private Path path = new Path();
	
/*	public TextFileWorkerNew(Path path) {
		this.path = path;
	}*/
//---------------------------------------------------------------------------------
	public String[] readFromFile(String path) {
		try (ObjectInputStream in =  new ObjectInputStream (new FileInputStream(path));){	
		/*	List<String> lines = Files.readAllLines(path, FILE_ENCODING);
			if (lines != null){
				return lines.toArray(new String[lines.size()]);
			}else{
				return new String [0];
			}*/
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
//---------------------------------------------------------------------------------
	public void writeToFile(String[] array, String path) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))){
			for (String s: array){
				out.writeObject(s);
			}
		} catch (Exception e){
			log.error(e);
		}
	}
}
