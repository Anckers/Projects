import java.util.HashMap;

public class CostumerRegister {

	private HashMap<String, Costumer> costumerRegisterMap = new HashMap<>();
	
	public CostumerRegister() {
		
	}

	public HashMap<String, Costumer> getCostumerRegisterMap() {
		return costumerRegisterMap;
	}

	public void setCostumerRegisterMap(HashMap<String, Costumer> costumerRegisterMap) {
		this.costumerRegisterMap = costumerRegisterMap;
	}

	public Boolean addCostumer(Costumer costumer) {
		if (!costumerRegisterMap.containsKey(costumer.getCostumerNumber())) {
			costumerRegisterMap.put(costumer.getCostumerNumber(), costumer);
			return true;			
		}
		else {
			return false;
		}
	}
	
	public Costumer findCostumer(String costumerNumber) {
		return costumerRegisterMap.get(costumerNumber);
	}
	
	public Costumer removeCostumer(String costumerNumber) {
		if (costumerRegisterMap.containsKey(costumerNumber)) {
			Costumer costumer = costumerRegisterMap.get(costumerNumber);
			costumerRegisterMap.remove(costumerNumber);
			return costumer;
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		String returnString = "";
		for (String costumer: costumerRegisterMap.keySet()) {
			returnString += "costumer: " + costumer + "| name: " + costumerRegisterMap.get(costumer).getName() + "\n";
		}
		return returnString;
	}
	
}
