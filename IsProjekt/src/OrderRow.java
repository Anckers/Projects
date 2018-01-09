


public class OrderRow {

	private String number;
	private Double quantity;
	private Product product;
	
	public OrderRow(String number, Product product) {
		this.number = number;
		this.product = product;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
