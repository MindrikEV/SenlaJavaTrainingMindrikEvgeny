package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Master;

import java.util.List;
import java.util.Comparator;

public interface IMasterManager {
	
	public void add(String name, String surName);
	public Boolean remove(String surName);
	public List<Master> getListOfMasters();	
	public Master getFreeMaster();
	public String getOrderOfMaster(String surName);
	public void sort(List<Master> listOfMasters, Comparator comparator);
}
