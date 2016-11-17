package org.senlatraining.autoservice.api;

import java.util.List;
import org.senlatraining.autoservice.entity.*;


public interface IGarageManager {
	
	public void add(); //throws Exception;
	public void remove(Integer number); // throws Exception
	public void showListOfGarages();
	public void showListOfFreeGarages();
	public List getListOfFreeGarages();
	public Garage getFreeGarage();
}
