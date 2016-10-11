package task3_3;

public class Flower {
	private String name;
	private String color;
	private Double price;
	private int amount;
	private static double sum = 0;
	
	public Flower(String name, String color, Double price, int amount){
		this.name = name;
		this.color = color;
		this.price = price;
		this.amount = amount;
	}
	public Flower(){
	}
	
	public void genSum(double costOfFlowers){
		this.sum += costOfFlowers;
	}
	
	public double getSum(){
		return sum; 
	}
}
