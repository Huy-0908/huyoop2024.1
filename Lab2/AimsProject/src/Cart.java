
public class Cart {
	private DigitalVideoDisc[] discs;
	private int qtyOrdered;
	private static final int MAX_DISCS = 20;
	public Cart() {
		discs= new DigitalVideoDisc[MAX_DISCS];
		qtyOrdered = 0;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_DISCS) {
			discs[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
	}
	public float totalCost() {
		float total=0;
		for (int i=0 ;i<qtyOrdered;i++) {
			total +=discs[i].getCost();
		}
		return total;
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
}
