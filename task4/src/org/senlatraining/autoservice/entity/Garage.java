package org.senlatraining.autoservice.entity;

public class Garage {
	private String nameOfGarage;
	private int amountOfPlaces;
	
	public Garage(String nameOfGarage, int amountOfPlaces){
		this.nameOfGarage = nameOfGarage;
		this.amountOfPlaces = amountOfPlaces;		
	}
//-------------------------------------------------------------------
	public Integer getAmount(){							// Get amount of places in this garage
		return this.amountOfPlaces;
	}
//-------------------------------------------------------------------
	public void incOfAmountOfPlaces(){					// Increment of count
		this.amountOfPlaces++;
	}
//-------------------------------------------------------------------
	public void decOfAmountOfPlaces(){					// Decrement of count
		this.amountOfPlaces--;
	}

}
