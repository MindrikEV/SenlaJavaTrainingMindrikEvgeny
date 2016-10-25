package org.senlatraining.autoservice.api;

public interface IParser {
	public final String SPLITTER = "\\|";
	
	public void parseFromFile(String[] array);
}
