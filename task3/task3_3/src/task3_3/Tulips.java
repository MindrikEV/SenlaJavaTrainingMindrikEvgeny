package task3_3;

public class Tulips extends Flower {
	
	public Tulips(String name, String color, double price, int amount){
		super(name, color, price, amount);
		super.genSum(price * amount);
	}

}
