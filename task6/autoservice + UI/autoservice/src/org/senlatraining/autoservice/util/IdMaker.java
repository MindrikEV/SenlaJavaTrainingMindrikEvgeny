package org.senlatraining.autoservice.util;

import java.util.Collections;

import org.senlatraining.autoservice.storage.Storage;
import org.senlatraining.autoservice.util.comparators.*;

public class IdMaker {
	private static Integer idOfOrder 	= 0;
	private static Integer idOfMaster 	= 0;
	private static Integer idOfGarage 	= 0;
	private Storage storage;
	
	public Integer getIdOfMaster(){
		return Collections.max(storage.listOfMasters, new ComparateMastersById()).getId() + 1;	
	} 
//-------------------------------------------------------------------------------------------------
	public Integer getIdOfGarage(){
		return Collections.max(storage.listOfGarages, new ComparateGaragesById()).getId() + 1;	
	}
//-------------------------------------------------------------------------------------------------	
	public Integer getIdOfOrders(){
		return Collections.max(storage.listOfOrders, new ComparateOrdersById()).getId() + 1;	
	}
}
