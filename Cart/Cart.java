package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import java.util.ArrayList;
public class Cart {
	private DigitalVideoDisc[] discs;
	private int qtyOrdered;
	private static final int MAX_DISCS = 20;
	private ArrayList<DigitalVideoDisc> items;
	public Cart() {
		discs= new DigitalVideoDisc[MAX_DISCS];
		qtyOrdered = 0;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {}

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
	 public void printCartDetails() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        double totalCost = 0;
	        
	        for (int i = 0; i < items.size(); i++) {
	            DigitalVideoDisc item = items.get(i);
	            System.out.println((i + 1) + ". " + item.toString());
	            totalCost += item.getCost();
	        }
	        
	        System.out.println("Total cost: " + totalCost + " $");
	        System.out.println("***************************************************");
	 }
	 public void searchById(int id) {
		    boolean test = false;
		    for (DigitalVideoDisc item : items) {
		        if (item.getId() == id) {
		            System.out.println("Found DVD: " + item.toString());
		            test = true;
		            break;
		        }
		    }

		    if (!test) {
		        System.out.println("No DVD found with the ID " + id);
		    }
		}
	 public void searchByTitle(String title) {
	        boolean test = false;

	        for (DigitalVideoDisc dvd : items) {
	            if (dvd.isMatch(title)) {
	                System.out.println("DVD found: " + dvd.toString());
	                test = true;
	            }
	        }

	        if (!test) {
	            System.out.println("No DVDs found with title: " + title);
	        }
	    }
}
