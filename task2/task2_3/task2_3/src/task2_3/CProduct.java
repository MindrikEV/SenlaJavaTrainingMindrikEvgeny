package task2_3;

public class CProduct implements IProduct{

	//@Override
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Now we have installed >>> BODY");
	}

	//@Override
	public void installSecondPart(IProductPart productPart) {
		System.out.println("And now we have installed >>> CHASSIS");
	}

	//@Override
	public void installThirdPart(IProductPart productPart) {
		System.out.println("At last we have installed >>> ENGINE");	
	}

}
