package hust.soict.hedspi.aims.Aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class Aims {

    private static Scanner sc = new Scanner(System.in);
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        // Thêm một DigitalVideoDisc vào cửa hàng
        store.addMedia(new DigitalVideoDisc("DVD title", "DVD category", "DVD director", 10, 200.1f));
        
        // Đóng Scanner
        sc.close();
        
        // Khởi tạo và hiển thị giao diện quản lý cửa hàng
        StoreManagerScreen store_manager = new StoreManagerScreen(store);
    }
}
