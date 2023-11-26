package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Thêm các DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Thử thêm một DVD có cùng tiêu đề với một DVD đã tồn tại trong cửa hàng
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd4);

        // Loại bỏ một DVD từ cửa hàng
        store.removeDVD("Star Wars");

        // Loại bỏ một DVD không tồn tại trong cửa hàng
        store.removeDVD("Harry Potter");
    }
}
