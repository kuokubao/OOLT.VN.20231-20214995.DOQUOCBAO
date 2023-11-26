package hust.soict.hedspi.test.store;



import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Store store = new Store();
				
				// create new dvd object and add them to the store
				DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
				DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
				DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
				
				// Kiểm tra phthuc addDVD
				store.addDVD(dvd1);
				store.addDVD(dvd2);
				store.addDVD(dvd3);
				
				store.addDVD(dvd2);
				
				// Kiểm tra phthuc reomveDVD
				store.removeDVD(dvd3);
	}
	
}
