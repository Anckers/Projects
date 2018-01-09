import java.util.HashMap;

public class Costumer {

		private String costumerNumber;
		private String name;
		private String adress;
		
		private HashMap<String, Order> ownedOrderMap = new HashMap<>();
		
		public Costumer(String costumerNumber, String name, String adress) {
			setCostumerNumber(costumerNumber);
			setName(name);
			setAdress(adress);
		}
		
		public HashMap<String, Order> getOwnedOrderMap() {
			return ownedOrderMap;
		}
		public void setOwnedOrderMap(HashMap<String, Order> ownedOrderMap) {
			this.ownedOrderMap = ownedOrderMap;
		}
		
		public void setCostumerNumber(String costumerNumber) {
			this.costumerNumber = costumerNumber;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		
		public String getCostumerNumber() {
			return costumerNumber;
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

