package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Master;

public interface IMaster {
	
	public void add(Master master);
	public void remove(Master master);
	public void showListOfMasters();
	public void getAmountOfMasters();
}
