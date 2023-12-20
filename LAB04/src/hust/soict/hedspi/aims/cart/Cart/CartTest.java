package hust.soict.hedspi.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        // Tạo một đối tượng giỏ hàng
        Cart cart = new Cart();

        // Tạo các đối tượng DVD và sách
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.85f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 24.95f);
        cart.addMedia(dvd3);

        Book book = new Book("Author", "Book Title", 19.99f, Arrays.asList("Be", "Nam Anh"));
        cart.addMedia(book);

        // Xóa một đối tượng DVD khỏi giỏ hàng
        cart.removeMedia(dvd2);

        // In thông tin của giỏ hàng
        cart.printOrder();

        // Tạo danh sách đối tượng Media và in thông tin của mỗi đối tượng trong danh sách
        List<Media> mediae = new ArrayList<Media>();
        mediae.add(book);
        mediae.add(dvd1);
        mediae.add(dvd2);
        for (Media m : mediae) {
            System.out.println("To String: " + m.toString());
        }
    }
}
