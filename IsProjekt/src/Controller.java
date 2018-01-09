
public class Controller {
	
	private CustomerRegister customerRegister;
	private ProductRegister productregister;
	
	public Controller(CustomerRegister customerRegister, ProductRegister productregister) {
		this.customerRegister = customerRegister;
		this.productregister = productregister;
	}
	
	public void addCustomer(String customerNumber, String name, String adress) {
		Customer customer = new Customer (customerNumber,name,adress);
		customerRegister.addCustomer(customer);	
	}
	
		
}
