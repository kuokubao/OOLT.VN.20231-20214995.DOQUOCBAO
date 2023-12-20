package Cart;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.LimitExceededException;

import Exception.DuplicatedItemException;
import Media.Media;
import Media.MediaComparatorByCostTitle;
import Media.MediaComparatorByTitleCost;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Số lượng tối đa đơn hàng

    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList(); // Danh sách các mặt hàng trong đơn hàng

    // Thêm một mặt hàng vào giỏ hàng
    public void addMedia(Media media) throws LimitExceededException, DuplicatedItemException {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("LỖI: Số lượng mặt hàng đã đạt giới hạn.");
        }

        if (itemsOrdered.contains(media)) {
            throw new DuplicatedItemException("LỖI: Mặt hàng đã có trong giỏ hàng.");
        }

        itemsOrdered.add(media);
    }

    // Xóa một mặt hàng khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Đã xóa " + media.toString() + " khỏi giỏ hàng.");
        } else {
            System.out.println("Không thể tìm thấy mặt hàng này.");
        }
    }

    // Tính tổng chi phí của đơn hàng
    public float totalCost() {
        float cost = 0;
        for (Media m : itemsOrdered) {
            cost += m.getCost();
        }
        return cost;
    }

    // In thông tin của giỏ hàng
    public void print() {
        System.out.println("\n***********************GIỎ HÀNG***********************");
        System.out.println("Các mặt hàng đã đặt:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Tổng chi phí: " + totalCost() + " $");
        System.out.println("******************************************************");
    }

    // Tìm một mặt hàng trong giỏ hàng dựa trên ID
    public void searchById(int id) {
        System.out.println("Kết quả tìm kiếm cho ID: " + id);
        for (Media m : itemsOrdered) {
            if (m.getId() == id) {
                System.out.println(m.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy mặt hàng nào.");
    }

    // Tìm mặt hàng trong giỏ hàng dựa trên tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Kết quả tìm kiếm cho từ khóa: " + title);
        for (Media m : itemsOrdered) {
            if (m.isMatch(title)) {
                System.out.println(m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy mặt hàng nào.");
        }
    }

    // Sắp xếp giỏ hàng theo tiêu đề
    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    // Sắp xếp giỏ hàng theo chi phí
    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    // Tìm và trả về một mặt hàng trong giỏ hàng dựa trên tiêu đề
    public Media fetchMedia(String title) {
        for (Media m : itemsOrdered) {
            if (m.isMatch(title)) {
                return m;
            }
        }
        return null;
    }

    // Đặt đơn hàng
    public void placeOrder() {
        itemsOrdered.clear();
    }

    // Trả về danh sách các mặt hàng trong giỏ hàng
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
