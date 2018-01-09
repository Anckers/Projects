import java.util.ArrayList;


public class Order {
		
	private String orderID;
	private String deliveryDate;
	private String owner;
	private static int orderIdCounter = 000001;

	private ArrayList<OrderRow> orderRowsList = new ArrayList<>();
	public Order(OrderRow orderRow) {
		setOrderID(Integer.toString(orderIdCounter));
		orderIdCounter++;
		addOrderRow(orderRow);
	}
	
	public void setOrderID(String orderID) {
		this.orderID=orderID;
	}
	
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOrderID() {
		return orderID;
	}
	
	public String getDeliveryDate() {
		return deliveryDate;
	}
	
	public String getOwner() {
		return owner;
	}
	public OrderRow addOrderRow(OrderRow orderRow) {
		if (!orderRowsList.contains(orderRow)) {
			orderRowsList.add(orderRow);
			return orderRow;
		}
		else {
			return null;
		}
	}

}
