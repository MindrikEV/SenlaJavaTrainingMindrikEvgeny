package task2_3;

public class CAssemblyLine implements IAssemblyLine{

	public IProduct assembleProduct(IProduct iproduct) {
		CLineStep first = new CLineStep("BODY");
		iproduct.installFirstPart(first.buildProductPart());
		
		CLineStep second = new CLineStep("CHASSIS");
		iproduct.installSecondPart(second.buildProductPart());
		
		CLineStep third = new CLineStep("ENGINE");
		iproduct.installThirdPart(third.buildProductPart());
		
		return iproduct;
	}

}
