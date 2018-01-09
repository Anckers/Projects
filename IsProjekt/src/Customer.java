import java.util.HashMap;

public class Customer {

		private String customerNumber;
		private String name;
		private String adress;
		
		private HashMap<String, Order> ownedOrderMap = new HashMap<>();
		
		public Customer(String customerNumber, String name, String adress) {
			setcustomerNumber(customerNumber);
			setName(name);
			setAdress(adress);
		}
		
		public HashMap<String, Order> getOwnedOrderMap() {
			return ownedOrderMap;
		}
		public void setOwnedOrderMap(HashMap<String, Order> ownedOrderMap) {
			this.ownedOrderMap = ownedOrderMap;
		}
		
		public void setcustomerNumber(String customerNumber) {
			this.customerNumber = customerNumber;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		
		public String getcustomerNumber() {
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
				return true;
			}
			else {
				return false;
			}
		}
		
}

