package task3_3;

abstract public class Flower {
	private String name;
	private String color;
	private double price;
	
	public Flower(String name, String color, double price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
//---------------------------------------------------------------
	public String getName(){
		return this.name;
	}
//---------------------------------------------------------------
	public String getColor(){
		return this.color;
	}
//---------------------------------------------------------------
	public double getPrice(){
		return this.price;
	}
}
