import java.util.ArrayList;


public class Order {
		
	private String orderID;
	private String deliveryDate;
	private Customer customer;
	private static int orderIdCounter = 000001;

	private ArrayList<OrderRow> orderRowsList = new ArrayList<>();
	
	public Order(Customer customer) {
		setOrderID(Integer.toString(orderIdCounter));
		orderIdCounter++;
		setCustomer(customer);
	}
	
	public void setOrderID(String orderID) {
		this.orderID=orderID;
	}
	
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderID() {
		return orderID;
	}
	
	public String getDeliveryDate() {
		return deliveryDate;
	}
	
	public Customer getCustomer() {
		return customer;
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
