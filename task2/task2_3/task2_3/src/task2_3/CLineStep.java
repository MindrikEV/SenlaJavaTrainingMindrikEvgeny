package task2_3;

public class CLineStep implements ILineStep{
	private String newStep;
	//@Override
	public CLineStep(String ns){
		this.newStep = ns;
	}
	public IProductPart buildProductPart() {
		System.out.println("Created new LINE STEP >>> " + this.newStep);
		CProductPart pp = new CProductPart(newStep);
		return pp;
	}

}
