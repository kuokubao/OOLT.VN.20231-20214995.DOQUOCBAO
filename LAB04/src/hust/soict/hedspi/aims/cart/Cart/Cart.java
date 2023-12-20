package hust.soict.hedspi.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

public class Cart implements Playable {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // In thông tin của toàn bộ giỏ hàng
    public void printOrder() {
        int totalCost = 0;
        for (Media media : itemsOrdered) {
            if (media != null) {
                System.out.println("Media - " + media.getTitle() + " - " + media.getCategory() + " - " + media.getDirector() + " - "
                        + media.getLength() + " : " + media.getCost() + " $");
                totalCost += media.getCost();
            }
        }
        System.out.println("Tổng chi phí: " + totalCost);
    }

    // In thông tin của một đối tượng Media cụ thể trong giỏ hàng
    public void printOrder(Media media) {
        if (media != null) {
            System.out.println("Media - " + media.getTitle() + " - " + media.getCategory() + " - " + media.getDirector() + " - "
                    + media.getLength() + " : " + media.getCost() + " $");
        }
    }

    // Tìm Media theo ID
    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media != null && media.isMatch(id)) {
                System.out.println("Tìm thấy Media có ID " + id + ":");
                System.out.println(media);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy Media có ID " + id + " trong giỏ hàng.");
        }
    }

    // Tìm Media theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media != null && media.isMatch(title)) {
                System.out.println("Tìm thấy Media chứa tiêu đề " + title + ":");
                System.out.println(media);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy Media có tiêu đề " + title + " trong giỏ hàng.");
        }
    }

    // Tính tổng chi phí của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Thêm Media vào giỏ hàng
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Đã thêm media vào giỏ hàng.");
        } else {
            System.out.println("Media đã có trong giỏ hàng.");
        }
    }

    // Thêm nhiều Media vào giỏ hàng
    public void addMedia(Media... mediaArray) {
        for (Media media : mediaArray) {
            if (!itemsOrdered.contains(media) && media != null) {
                itemsOrdered.add(media);
                System.out.println("Đã thêm media vào giỏ hàng.");
            } else {
                System.out.println("Không thể thêm media vào giỏ hàng.");
            }
        }
    }

    // Xóa Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Đã xóa media khỏi giỏ hàng.");
        } else {
            System.out.println("Không tìm thấy media trong giỏ hàng.");
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

    // Phát Media dựa trên tiêu đề
    public Media playMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().equals(title.toLowerCase())) {
                System.out.println("Đang phát media: " + media.toString());
                return media;
            }
        }
        System.out.println("Không tìm thấy media: ");
        return null;
    }

    // Đặt hàng
    public void placeOrder() {
        System.out.println("Đã đặt hàng.");
    }

    @Override
    public void play() {
        // Phương thức play từ giao diện Playable
        // Không cần triển khai ở đây
    }
}
