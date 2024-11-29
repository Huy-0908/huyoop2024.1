package hust.soict.dsai.aims.AIMS;
import hust.soict.dsai.aims.media.*;
import java.util.Scanner;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Store;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.CompactDisc;

public class Aims {
	private static Store store = new Store();
	private static Cart cart = new Cart();

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		Track track1 = new Track("Huy", 13);
		Track track2 = new Track("Hoang", 21);
		CompactDisc cd1 = new CompactDisc("Allstars", "Yes", "Smash Teeth", "Dunno", 69.420f);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		Book book1 = new Book("Sherlock Holmes", "Detective", 5f);
		book1.addAuthor("Conan Edo");
		book1.addAuthor("Honnorr");
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.addMedia(cd1);
		store.addMedia(book1);
       }
	public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");       
    }
	public static void storeMenu(Scanner scanner) {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
}
	public static void viewStore(Scanner scanner) {
        store.listItems();
        storeMenu(scanner);
    }
	public static void cartMenu(Scanner scanner) {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		}
	public static void updateStore(Scanner scanner) {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to the store");
        System.out.println("2. Remove a media from the store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
	}
}