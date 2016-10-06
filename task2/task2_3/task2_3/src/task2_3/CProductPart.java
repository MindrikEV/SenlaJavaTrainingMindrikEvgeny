package task2_3;

public class CProductPart implements IProductPart{
	private String name;
	public CProductPart(String n){
		this.name = n;
		System.out.println("Created new part >>> " + this.name);
	}
}
