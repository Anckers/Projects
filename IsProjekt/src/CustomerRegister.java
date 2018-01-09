import java.util.HashMap;

public class CustomerRegister {

	private HashMap<String, Customer> customerRegisterMap = new HashMap<>();
	
	public CustomerRegister() {
		
	}

	public HashMap<String, Customer> getcustomerRegisterMap() {
		return customerRegisterMap;
	}

	public void setCustomerRegisterMap(HashMap<String, Customer> customerRegisterMap) {
		this.customerRegisterMap = customerRegisterMap;
	}

	public Boolean addCustomer(Customer customer) {
		if (!customerRegisterMap.containsKey(customer.getCustomerNumber())) {
			customerRegisterMap.put(customer.getCustomerNumber(), customer);
			return true;			
		}
		else {
			return false;
		}
	}
	
	public Customer findCustomer(String customerNumber) {
		return customerRegisterMap.get(customerNumber);
	}
	
	public Customer removeCustomer(Customer customer2) {
		if (customerRegisterMap.containsKey(customer2)) {
			Customer customer = customerRegisterMap.get(customer2);
			customerRegisterMap.remove(customer2);
			return customer;
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		String returnString = "";
		for (String customer: customerRegisterMap.keySet()) {
			returnString += "customer: " + customer + "| name: " + customerRegisterMap.get(customer).getName() + "\n";
		}
		return returnString;
	}
	
}
