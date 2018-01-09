import java.util.ArrayList;
import java.util.HashMap;

public class Product {

	private String name;
	private String category;
	private int price;
	private String orderrow;
	
	private HashMap<String, Specimen> specimenMap = new HashMap<String, Specimen>();
	private ArrayList<OrderRow> orderRowList = new ArrayList<OrderRow>();
		
	public Product(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public String getOrderrow() {
		return orderrow;
	}

	public void setOrderrow(String orderrow) {
		this.orderrow = orderrow;
	}

	public HashMap<String, Specimen> getSpecimenMap() {
		return specimenMap;
	}

	public void setSpecimenMap(HashMap<String, Specimen> specimenMap) {
		this.specimenMap = specimenMap;
	}

	public ArrayList<OrderRow> getOrderRowList() {
		return orderRowList;
	}

	public void setOrderRowList(ArrayList<OrderRow> orderRowList) {
		this.orderRowList = orderRowList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Boolean addSpecimen(Specimen specimen) {
		if(!specimenMap.containsKey(specimen.getSerialNumber())) {
			specimenMap.put(specimen.getSerialNumber(), specimen);
			return true;
		}
		else {
			return false;
		}
	}
	
	public Specimen findSpecimen(String specimen) {
		return specimenMap.get(specimen);
	}
	
	public Specimen removeSpecimen(String sN) {
		if(specimenMap.containsKey(sN)) {
			Specimen specimen = specimenMap.get(sN);
			specimenMap.remove(sN);
			return specimen;
		}
		else {
			return null;
		}
	}
}
