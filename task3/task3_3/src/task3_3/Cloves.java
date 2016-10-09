package task3_3;

public class Cloves extends Flower {
	
	public Cloves(String name, String color, double price, int amount){
		super(name, color, price, amount);
		super.genSum(price * amount);
	}
}
