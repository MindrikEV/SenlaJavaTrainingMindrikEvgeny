package task2_3;

public class CAssemblyLine implements IAssemblyLine{

	//@Override
	public IProduct assembleProduct(IProduct productPart) {
		CLineStep first = new CLineStep("BODY");
		productPart.installFirstPart(first.buildProductPart());
		CLineStep second = new CLineStep("CHASSIS");
		productPart.installSecondPart(second.buildProductPart());
		CLineStep third = new CLineStep("ENGINE");
		productPart.installThirdPart(third.buildProductPart());
		return productPart;
	}

}
