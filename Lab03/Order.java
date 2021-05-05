
public class Order {
	//final: hang
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new
			DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigtalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("ERROR!!!");		
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("SUCCESS!!! total disc: " + qtyOrdered);
		}
		
	}
	
	public void removeDigtalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j < qtyOrdered - 1; j++)
					itemsOrdered[j] = itemsOrdered[j+1];
				qtyOrdered--;
			}
		}
	}
	
	public float totalCost() {
		float totalCost = 0.0f;
		for(int i = 0; i < qtyOrdered; i++){
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	
}
