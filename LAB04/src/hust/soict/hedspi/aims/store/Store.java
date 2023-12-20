package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

public class Store implements Playable {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media has been added.");
        } else {
            System.out.println("The media is already in store.");
        }
    }
	public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media was not found in the cart.");
        }
    }
	public boolean searchByTitle(String title) {
		for (Media item : itemsOrdered) {
			if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
				System.out.println("Item info: " + item.toString());
				return true;
			}
		}
		return false;
	}
	public void displayItems() {
		for (Media item: itemsOrdered) {
			System.out.println("Item info: " + item.toString());
		}
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

	public ArrayList<Media> getItemsInStore(){
		return itemsOrdered;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}
