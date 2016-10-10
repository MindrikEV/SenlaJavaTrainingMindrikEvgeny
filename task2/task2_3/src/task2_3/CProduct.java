package task2_3;

public class CProduct implements IProduct{
	private IProductPart productPart;
	
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Install");
		System.out.println();
	}
	
//-----------------------------------------------------------------
	
	public void installSecondPart(IProductPart productPart) {
		System.out.println("Install");
		System.out.println();
	}

//-----------------------------------------------------------------
	
	public void installThirdPart(IProductPart productPart) {
		System.out.println("Install");	
		System.out.println();
	}
}
