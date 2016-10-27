package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Master;

public interface IMasterManager {
	
	public void add(Master master);
	public void remove(Master master);
	public void showListOfMasters();
	public Master[] getListOfMasters();	
	public void getAmountOfMasters();
	public Master getFreeMaster();
	public void showOrderOfMaster(Master master);
	public void sortMastersListBySurName(Master[] listOfMasters);
	public void sortMastersListByStatus(Master[] listOfMasters);
}
