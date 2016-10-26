package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.*;

public interface IGarageManager {
	
	public void add(Garage garage);
	public void remove(Garage garage);
	public void showListOfGarages();
	public void showListOfFreeGarages();
}
