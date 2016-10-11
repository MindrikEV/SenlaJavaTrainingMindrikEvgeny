package task3_3;

public class Main {
	public static void main(String[] args){
		
		Roses rose1 	= new Roses("rose1", "black", 25, 2);        // name, color, price, amount
		Roses rose2 	= new Roses("rose2", "red", 20.5, 1);
		Tulips tulip1 	= new Tulips("tulip1", "yellow", 23, 7);
		Tulips tulip2 	= new Tulips("tulip2", "white", 12, 2);
		Tulips tulip3 	= new Tulips("tulip3", "pink", 45, 4);
		Cloves clove 	= new Cloves("clove1","green", 5, 7);
		
			
		Flower flower = new Flower();
		System.out.print("Your bouquet cost --> " + flower.getSum());
	}
}
