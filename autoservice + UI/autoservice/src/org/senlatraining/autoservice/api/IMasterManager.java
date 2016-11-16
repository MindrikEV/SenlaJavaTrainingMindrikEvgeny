package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Master;

import java.util.List;
import java.util.Comparator;

public interface IMasterManager {
	
	public void add(Master master);
	public void remove(Master master);
	public void showListOfMasters();
	public List<Master> getListOfMasters();	
	public Master getFreeMaster();
	public void showOrderOfMaster(Master master);
	public void sort(List<Master> listOfMasters, Comparator comparator);
}
