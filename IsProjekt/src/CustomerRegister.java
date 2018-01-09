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
		if (!customerRegisterMap.containsKey(customer.getcustomerNumber())) {
			customerRegisterMap.put(customer.getcustomerNumber(), customer);
			return true;			
		}
		else {
			return false;
		}
	}
	
	public Customer findcustomer(String customerNumber) {
		return customerRegisterMap.get(customerNumber);
	}
	
	public Customer removecustomer(String customerNumber) {
		if (customerRegisterMap.containsKey(customerNumber)) {
			Customer customer = customerRegisterMap.get(customerNumber);
			customerRegisterMap.remove(customerNumber);
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
