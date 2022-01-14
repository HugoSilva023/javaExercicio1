package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + getCustomFee();
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
			sb.append(getName());
			sb.append(" $");
			sb.append(String.format("%.2f", totalPrice()));
			sb.append(" (Customs fee: $ ");
			sb.append(String.format("%.2f", getCustomFee()));
			sb.append(")");
		return sb.toString();
	}
}