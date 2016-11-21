package org.senlatraining.autoservice.api;

import java.util.List;
import org.senlatraining.autoservice.entity.*;


public interface IGarageManager {
	
	public void add();
	public Boolean remove(Integer number);
	public List<Garage> getListOfFreeGarages();
	public Garage getFreeGarage();
}
