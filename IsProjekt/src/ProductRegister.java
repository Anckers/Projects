import java.util.HashMap;

public class ProductRegister {

	private HashMap<String, Product> productregistermap = new HashMap<String, Product>();
	

	public ProductRegister() {
		
	}

	public HashMap<String, Product> getProductregistermap() {
		return productregistermap;
	}

	public void setProductregistermap(HashMap<String, Product> productregistermap) {
		this.productregistermap = productregistermap;
	}
	
	public Boolean addProduct(Product product) {
		if(!productregistermap.containsKey(product.getName())) {
			productregistermap.put(product.getName(), product);
			return true;
		}	
		else {
			return false;
		}
	}
	
	public Product findProduct(String name) {
		return productregistermap.get(name);
	}
	
	public Product removeProduct(String name) {
		if(productregistermap.containsKey(name)) {
			Product product = productregistermap.get(name);
			productregistermap.remove(name);
			return product;
		}
		else {
			return null;
		}
	}
	
}
