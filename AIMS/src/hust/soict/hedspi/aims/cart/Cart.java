package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDER) {
            System.out.println("Cart is almost full.");
            return;
        }
        itemOrdered[qtyOrdered++] = disc;
        System.out.println("The disc " + disc.getTitle() + " has been added.");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        int j = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (!itemOrdered[i].equals(disc)) {
                itemOrdered[j++] = itemOrdered[i];
            }
        }

        if (qtyOrdered == j) {
            System.out.println("The disc " + disc.getTitle() + " is not in the cart.");
        } else {
            qtyOrdered = j;
            System.out.println("The disc " + disc.getTitle() + " has been removed.");
        }
    }

    public float totalCost() {
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemOrdered[i].getCost();
        }
        return cost;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered >= MAX_NUMBERS_ORDER) {
                System.out.println("Cart is almost full.");
                break;
            }
            itemOrdered[qtyOrdered++] = dvd;
            System.out.println("The disc " + dvd.getTitle() + " has been added.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDER) {
            System.out.println("Cart is almost full.");
            return;
        }
        itemOrdered[qtyOrdered++] = dvd1;
        System.out.println("The disc " + dvd1.getTitle() + " has been added.");

        itemOrdered[qtyOrdered++] = dvd2;
        System.out.println("The disc " + dvd2.getTitle() + " has been added.");
    }

    public void print() {
        System.out.println("**************CART**************");
        System.out.println("Ordered Items");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". " + itemOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("********************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id) {
                System.out.println("Found DVD with ID: " + id);
                System.out.println(itemOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for DVD with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found DVD with title: " + title);
                System.out.println(itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for DVD with title: " + title);
        }
    }
}
