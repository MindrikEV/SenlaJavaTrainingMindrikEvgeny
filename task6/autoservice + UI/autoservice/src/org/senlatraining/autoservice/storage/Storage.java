package org.senlatraining.autoservice.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.entity.Master;
import org.senlatraining.autoservice.entity.Order;

public class Storage{
	private static Storage instance;
	public List<Garage> listOfGarages 	= new ArrayList<Garage>();
	public List<Master> listOfMasters 	= new ArrayList<Master>();
	public List<Order>  listOfOrders 	= new ArrayList<Order>();
	
	private Storage(){
	}
//---------------------------------------------------------------------
	public static Storage getInstance(){
		if (instance == null){
			instance = new Storage();
		}
		return instance;
	}
}
