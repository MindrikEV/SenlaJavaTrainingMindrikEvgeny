package task2_3;

public class CAssemblyLine implements IAssemblyLine{

	public IProduct assembleProduct(IProduct iproduct) {
		LineStep1 first = new LineStep1();
		iproduct.installFirstPart(first.buildProductPart());
		
		LineStep2 second = new LineStep2();
		iproduct.installSecondPart(second.buildProductPart());
		
		LineStep3 third = new LineStep3();
		iproduct.installThirdPart(third.buildProductPart());
		
		return iproduct;
	}

}
