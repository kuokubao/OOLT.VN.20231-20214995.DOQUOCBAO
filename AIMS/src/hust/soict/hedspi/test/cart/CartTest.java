package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 19.95f, 87);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 24.95f, 87);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Unknown", 18.99f, 90);
        cart.addDigitalVideoDisc(dvd3);

        // Print the cart contents
        cart.print();

        // Search for DVDs by ID and title
        cart.searchById(5); // Assuming there's no DVD with ID 5
        cart.searchById(3); // Search for DVD with ID 3 (Aladin)
        cart.searchByTitle("The Lion King"); // Search for DVD with title "The Lion King"
        cart.searchByTitle("The"); // Search for DVDs with "The" in the title
    }
}
