package entities;

public class ImportedProduct extends Product {

	private double customsfee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsfee) {
		super(name, price);
		this.customsfee = customsfee;
	}

	public double getCustomsfee() {
		return customsfee;
	}

	public void setCustomsfee(double customsfee) {
		this.customsfee = customsfee;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + "(Customs fee: $ "+customsfee+")";
		
	}
	
}
