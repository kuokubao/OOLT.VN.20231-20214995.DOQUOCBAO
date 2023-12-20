package hust.soict.hedspi.aims.cart.Cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

public class Cart implements Playable {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

		//print all
	public void printOrder() {
		int totalCost = 0;
		for (Media media : itemsOrdered) {
			if (media != null) {
			System.out.println("media - " + media.getTitle() + " - " + media.getCategory() + " - " + media.getDirector() + " - " 
					+ media.getLength() + " : " + media.getCost() + " $");
			totalCost += media.getCost();
			}
		}
		System.out.println("Total cost: " + totalCost);
	}
		//print only one
	public void printOrder(Media dvd) {
		if (dvd != null) {
			System.out.println("Media - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " 
					+ dvd.getLength() + " : " + dvd.getCost() + " $");
		}
	}
	public void searchById(int id) {
        boolean found = false;
        for (Media dvd : itemsOrdered) {
            if (dvd != null && dvd.isMatch(id)) {
                System.out.println("Found Media with ID " + id + ":");
                System.out.println(dvd);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Media found with ID " + id + " in the cart.");
        }
    }
	
	public void searchByTitle(String title) {
        boolean found = false;
        for (Media dvd : itemsOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                System.out.println("Found Media that contain title " + title + ":");
                System.out.println(dvd);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Media found with title " + title + " in the cart.");
        }
    }
	
	public float totalCost() {
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}
	
	public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media has been added.");
        } else {
            System.out.println("The media is already in cart.");
        }
    }
	
	public void addMedia(Media... mediaArray) {
        for (Media media : mediaArray) {
            if (!itemsOrdered.contains(media) && media != null) {
                itemsOrdered.add(media);
                System.out.println("The media has been added.");
            } else {
                System.out.println("Cannot add media to the cart.");
            }
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media was not found in the cart.");
        }
    }
    
    public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
    
    public Media playMedia(String title) {
		for (Media item : itemsOrdered) {
			if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
				System.out.println("Playing media: " + item.toString());
				return item;
			}
		}
		System.out.println("Media not found: ");
		return null;
	}
    public void placeOrder() {
    	System.out.println("Order placed");
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
