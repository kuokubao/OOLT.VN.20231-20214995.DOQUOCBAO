package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> mediaList;
    private static final int MAX_CD_STORE = 100; // Assuming the store can hold a maximum of 100 CDs
    private static final int MAX_BOOK_STORE = 100; // Assuming the store can hold a maximum of 100 books

    public Store() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(Media media) {
        mediaList.add(media);
        System.out.println("Media " + media.getTitle() + " added to the store.");
    }

    public void removeMedia(int id) {
        for (Media media : mediaList) {
            if (media.getId() == id) {
                System.out.println("Media " + media.getTitle() + " removed from the store.");
                mediaList.remove(media);
                return;
            }
        }
        System.out.println("Media with ID " + id + " not found in the store.");
    }

    public List<Media> getAllMedia() {System.out.println(MAX_CD_STORE);
    System.out.println(MAX_BOOK_STORE);

        return new ArrayList<>(mediaList);
    }
}
