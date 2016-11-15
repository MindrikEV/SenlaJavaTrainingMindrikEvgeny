package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.*;

public interface IGarageManager {
	
	public void add(Garage garage); //throws Exception;
	public void remove(Garage garage); // throws Exception
	public void showListOfGarages();
	public void showListOfFreeGarages();
	public Garage getFreeGarage();
}
