package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	    public static void main(String[] args) {
	        Store store = new Store();
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 90,19.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 80,17.99f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Mulan", "Animation", "Tony Bancroft", 88,21.99f);
	        store.addDVD(dvd1);
	        store.addDVD(dvd2);
	        store.addDVD(dvd3);
	        store.printStore();
	        store.removeDVD(dvd2);
	        DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Hercules", "Animation", "John Musker", 93, 15.99f);
	        store.removeDVD(dvdNotInStore);
	        store.printStore();
	}
}

