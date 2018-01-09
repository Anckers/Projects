import java.util.HashMap;

public class Customer {

		private String customerNumber;
		private String name;
		private String adress;
		
		private HashMap<String, Order> ownedOrderMap = new HashMap<>();
		
		public Customer(String customerNumber, String name, String adress) {
			setCustomerNumber(customerNumber);
			setName(name);
			setAdress(adress);
		}
		
		public HashMap<String, Order> getOwnedOrderMap() {
			return ownedOrderMap;
		}
		public void setOwnedOrderMap(HashMap<String, Order> ownedOrderMap) {
			this.ownedOrderMap = ownedOrderMap;
		}
		
		public void setCustomerNumber(String customerNumber) {
			this.customerNumber = customerNumber;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		
		public String getCustomerNumber() {
			return customerNumber;
		}
		public String getName() {
			return name;
		}
		public String getAdress() {
			return adress;
		}	
		public Boolean addOrder(Order order) {
			if (!ownedOrderMap.containsKey(order.getOrderID())) {
				ownedOrderMap.put(order.getOrderID(), order);
				order.setCustomer(this);
				return true;
			}
			else {
				return false;
			}
		}
		
		public Order removeOrder(Order order) {
			if (!ownedOrderMap.containsKey(order.getOrderID())) {
				Order o = ownedOrderMap.get(order);
				ownedOrderMap.remove(order);
				return order;
			}
			else {
				return null;
			}
		}
		
		public Order findOrder(String orderID) {
			return ownedOrderMap.get(orderID);
		}
}

