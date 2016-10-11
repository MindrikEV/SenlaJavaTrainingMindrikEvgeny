package task3_3;

public class Roses extends Flower{
	
	public Roses(String name, String color, double price, int amount){
		super(name, color, price, amount);
		super.genSum(price * amount);
	}
}
