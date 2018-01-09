
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
	
	public Customer findCustomer(String customerNumber){
		return customerRegister.findCustomer(customerNumber);	
	}

	public Customer removeCustomer (String customerNumber){
		
		Customer customer = customerRegister.findCustomer(customerNumber);
		customerRegister.removeCustomer(customer);
		return customer;
	}
		
	public void addOrder(String customerNumber) {
		
		Customer customer = customerRegister.findCustomer(customerNumber);	
		if (customer!=null) {
			Order order = new Order(customer);
			customer.addOrder(order);	
		}
	}

	public Order removeOrder(String orderID, String customerNumber) {
		Customer customer = customerRegister.findCustomer(customerNumber);
		if (customer!=null) {
			Order o = customer.findOrder(orderID);
			customer.removeOrder(o);

			return o;
		}
		return null;
	}
}
