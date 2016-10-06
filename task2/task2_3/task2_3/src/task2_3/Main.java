package task2_3;

public class Main {
	public static void main(String[] args){
		System.out.println("Start.  Now we Creating a new CAR");
		
		CAssemblyLine assemblyCar = new CAssemblyLine();
		CProduct car = new CProduct();
		assemblyCar.assembleProduct(car);
		
		System.out.println("Done.  Now we have cool car.");
	}
}
