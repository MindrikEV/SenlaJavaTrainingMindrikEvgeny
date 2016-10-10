package task2_3;

public class LineStep3 implements ILineStep{

	public LineStep3(){
		System.out.println("LINE STEP >>> 3");
	}
	
//------------------------------------------------------------	
	
	public IProductPart buildProductPart() {
		ProductPartEngine pp = new ProductPartEngine();
		
		return pp;
	}
}
