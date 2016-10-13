package task3_3;

public class Main {
	public static void main(String[] args){
		
		Roses rose1 = new Roses(" rose1 ", "black ", 25);
		Roses rose2 = new Roses(" rose2 ", "white ", 23);
		Roses rose3 = new Roses(" rose3 ", "yellow ", 21);
		Roses rose4 = new Roses(" rose4 ", "red ", 27);
		Roses rose5 = new Roses(" rose5 ", "green ", 14);
		Tulips tulip1 = new Tulips(" tulip1 ", "pink ", 12.6);
		Tulips tulip2 = new Tulips(" tulip2 ", "gray ", 15.2);
		Tulips tulip3 = new Tulips(" tulip3 ", "blue ", 25);
		Tulips tulip4 = new Tulips(" tulip4 ", "silver ", 17);
		Cloves clove1 = new Cloves(" clove1 ", "yellow ",16.1);
		Cloves clove2 = new Cloves(" clove2 ", "black ", 30.9);
		Cloves clove3 = new Cloves(" clove3 ", "red ", 3);
		Cloves clove4 = new Cloves(" clove4 ", "black ", 2.5);
		Cloves clove5 = new Cloves(" clove5 ", "black ", 12.1);
		Cloves clove6 = new Cloves(" clove6 ", "blue ", 20);
		Cloves clove7 = new Cloves(" clove7 ", "red ", 7);
		
		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(rose1);
		bouquet.addFlower(rose2);
		bouquet.addFlower(rose3);
		bouquet.addFlower(rose4);
		bouquet.addFlower(rose5);
		bouquet.addFlower(tulip1);
		bouquet.addFlower(tulip2);
		bouquet.addFlower(tulip3);
		bouquet.addFlower(tulip4);
		bouquet.addFlower(clove1);
		bouquet.addFlower(clove2);
		bouquet.addFlower(clove3);
		bouquet.addFlower(clove4);
		bouquet.addFlower(clove5);
		
		bouquet.getBouquet();
		bouquet.getSum();
		
	}
}
