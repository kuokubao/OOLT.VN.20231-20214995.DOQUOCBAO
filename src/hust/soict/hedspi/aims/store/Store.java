package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qtyDVDs;
    private static final int MAX_STORE = 100; // Giả sử store có thể chứa tối đa 100 DVD

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_STORE];
        qtyDVDs = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyDVDs >= MAX_STORE) {
            System.out.println("The store is full.");
            return;
        }

        for (int i = 0; i < qtyDVDs; i++) {
            if (itemsInStore[i].isMatch(dvd.getTitle())) {
                System.out.println("DVD with title " + dvd.getTitle() + " already exists in the store.");
                return;
            }
        }

        itemsInStore[qtyDVDs++] = dvd;
        System.out.println("DVD " + dvd.getTitle() + " added to the store.");
    }

    public void removeDVD(String title) {
        if (qtyDVDs == 0) {
            System.out.println("Store is empty.");
            return;
        }

        boolean found = false;
        int j = 0;
        for (int i = 0; i < qtyDVDs; i++) {
            if (itemsInStore[i].isMatch(title)) {
                System.out.println("DVD " + title + " has been removed from the store.");
                found = true;
            } else {
                itemsInStore[j++] = itemsInStore[i];
            }
        }

        if (!found) {
            System.out.println("The disc " + title + " is not in the store.");
        } else {
            qtyDVDs = j;
        }
    }
}
