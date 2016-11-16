package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.*;

public interface IGarageManager {
	
	public void add(); //throws Exception;
	public void remove(Integer number); // throws Exception
	public void showListOfGarages();
	public void showListOfFreeGarages();
	public Garage getFreeGarage();
}
