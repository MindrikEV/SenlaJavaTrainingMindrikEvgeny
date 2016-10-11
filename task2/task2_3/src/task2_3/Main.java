package task2_3;

public class Main {
	public static void main(String[] args){
		System.out.println("Start!");

	//-----------------------------------------------------------
		
		CProduct car = new CProduct();
		CAssemblyLine assemblyCar = new CAssemblyLine();
		assemblyCar.assembleProduct(car);
		
	//-----------------------------------------------------------
		
		System.out.println("Done.");
	}
}