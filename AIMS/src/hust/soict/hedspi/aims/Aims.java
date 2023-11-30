package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.Media;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewStore(store, scanner);
                    break;
                // Other cases
                // ...
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
        scanner.close(); // Close the scanner when done
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        // Add other main menu options
        // ...
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-...");
    }

    public static void viewStore(Store store, Scanner scanner) {
        // Display store items (pseudo code)
        for (Media media : store.1()) {
            System.out.println(media.getTitle());
            // Display other details
        }

        int choice = -1;
        while (choice != 0) {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    seeMediaDetails(store, scanner);
                    break;
                case 2:
                    addToCart(store, scanner);
                    break;
                case 3:
                    playMedia(store, scanner);
                    break;
                case 4:
                    seeCurrentCart(store);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    // Implement other menu methods and functionalities...

    // Placeholder methods for functionality within viewStore method
    public static void storeMenu() {
        // Implement store menu options display
    }

    public static void seeMediaDetails(Store store, Scanner scanner) {
        // Implement seeing media details
    }

    public static void addToCart(Store store, Scanner scanner) {
        // Implement adding to cart
    }

    public static void playMedia(Store store, Scanner scanner) {
        // Implement playing media
    }

    public static void seeCurrentCart(Store store) {
        // Implement seeing current cart
    }
}
