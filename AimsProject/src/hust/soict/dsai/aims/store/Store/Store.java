package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class Store {
	 private ArrayList<DigitalVideoDisc> itemsInStore;
	 public Store() {
	        itemsInStore = new ArrayList<>(); 
	    }
	 public void addDVD(DigitalVideoDisc dvd) {
		 itemsInStore.add(dvd);
		 System.out.println(dvd.toString()+ "has been added");
	 }
	
	 public void removeDVD(DigitalVideoDisc dvd) {
		 if (itemsInStore.remove(dvd)) {
		            System.out.println("The DVD" + dvd.getTitle() + "has been removed");
		        } else {
		            System.out.println("The DVD doesn't exist");
		        }
		    }
	 public void printStore() {
	        if (itemsInStore.isEmpty()) {
	            System.out.println("The store is currently empty.");
	        } else {
	            for (DigitalVideoDisc dvd : itemsInStore) {
	                System.out.println(dvd.toString());
	            }
	        }
	    }
	}
