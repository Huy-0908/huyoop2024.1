package hust.soict.dsai.test.cart.CartTest;
import hust.soict.dsai.aims.cart.Cart.Cart;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",87,24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","Roger Calks",87,18.99f);
		cart.addDigitalVideoDisc(dvd3);
		cart.printCartDetails();
	    cart.searchById(1);
	    cart.searchById(3);
	    cart.searchByTitle("The Lion King");
	    cart.searchByTitle("Star Wars");
	}
}
