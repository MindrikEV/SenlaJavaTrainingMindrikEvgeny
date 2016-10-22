package org.senlatraining.autoservice.entity;

import org.senlatraining.autoservice.util.date.DateWorker;
import java.util.Date;


public class Order {
	private static Integer counter = 0;
	private DateWorker dateWorker = new DateWorker();
	private Integer idOfOrder;
	private Double price;
	private String description;
	private String status;
	private Date dateOfRegistration;
	private Date dateOfComplete;
	private Date dateOfPlanStart;
	private Master master;
	private Garage garage;
	
	public Order(String description, Double price, Date dateOfComplete, Date dateOfPlanComplete){
		this.description = description;
		this.price = price;
		this.idOfOrder = ++counter;
		this.status = "active";
		this.dateOfRegistration = dateWorker.getCurrentDate();
		this.dateOfComplete = dateOfComplete;
		this.dateOfPlanStart = dateOfPlanStart;
	}
//----------------------------------------------------------------
	public void setPrice(Double price){
		this.price = price;
	}
//-----------------------------------------------------------------
	public Double getPrice(){
		return this.price;
	}
//-----------------------------------------------------------------
	public void setDescription(String description){
		this.description = description;
	}
//-----------------------------------------------------------------
	public String getDescription(){
		return this.description;
	}
//-----------------------------------------------------------------
	public Integer getId(){
		return idOfOrder;
	}
//-----------------------------------------------------------------
	public void setStatus(String status){
		this.status = status;
	}
//-----------------------------------------------------------------
	public String getStatus(){
		return this.status;
	}
//-----------------------------------------------------------------
	public Date getDateOfRegistration(){
		return this.dateOfRegistration;
	}
//-----------------------------------------------------------------
	public Date getDateOfComplete(){
		return this.dateOfComplete;
	}
//-----------------------------------------------------------------
	public void setDateOfComplete(Date dateOfComplete){
		this.dateOfComplete = dateOfComplete;
	}
//-----------------------------------------------------------------
	public Date getDateOfPlanStart(){
		return this.dateOfPlanStart;
	}
//-----------------------------------------------------------------
	public void setDateOfPlanStart(Date dateOfPlanStart){
		this.dateOfPlanStart = dateOfPlanStart;
	}
//-----------------------------------------------------------------	
	public void setMaster(Master master){
		this.master = master;
	}
//-----------------------------------------------------------------
	public void setGarage(Garage garage){
		this.garage = garage;
	}
//-----------------------------------------------------------------
	public Master getMaster(){
		return master;
	}
//-----------------------------------------------------------------
	public Garage getGarage(){
		return garage;
	}	
//-----------------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(getDescription());
		s.append("|");
		s.append(getPrice());
		s.append("|");
		s.append(getStatus());
		s.append("|");
		s.append(getDateOfRegistration());
		s.append("|");
		s.append(getDateOfComplete());
		s.append("|");
		s.append(getDateOfPlanStart());

		return s.toString();
	}
}
