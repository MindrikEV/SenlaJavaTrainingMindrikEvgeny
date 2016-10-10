package task2_3;

public class CLineStep implements ILineStep{
	private String name;

	public CLineStep(String name){
		this.name = name;
		System.out.println("LINE STEP >>> " + this.name);
	}
//---------------------------------------------------------------	
	public IProductPart buildProductPart() {
		CProductPart pp = new CProductPart(this.name);
		
		return pp;
	}
}
