package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
	//Bui Ta Duc 20215035
	private static int MAX_STORE = 10000; // Khai báo số lượng max của Store
	private DigitalVideoDisc itemsInStore[] 
				  = new DigitalVideoDisc[MAX_STORE];  // Khai báo dưới 1 mảng
	private int qtyDVDs = 0; // Số lượng dvd hiện có 
	
	//Phuong thức addDVD()
	public void addDVD(DigitalVideoDisc dvd) {
		boolean hadDVD = false; // biến check xem dvd đã được thêm vao chưa
		
		if(qtyDVDs >= MAX_STORE) { // kiểm tra xem Store đã đầy chưa
			System.out.println("The store is full.");
		}else {
			for(int i = 0; i  < qtyDVDs; i++) { //check xem dvd đã được thêm vao chưa
				if( itemsInStore[i].isMatch(dvd.getTitle()) ) { // Sử dụng isMacth() để check title
					System.out.println("DVD with title " + dvd.getTitle() + " already exist in the store.");
					hadDVD = true;
					break;
				}
			}
			if(!hadDVD) { // nếu đĩa chưa có thì them vào
				itemsInStore[qtyDVDs] = dvd;
				qtyDVDs ++;
				System.out.println("DVD "+ dvd.getTitle() +" added in the store.");
			}
		}
	}
	//Bui Ta Duc 20215035
	//phương thức removeDVD()
	public void removeDVD(DigitalVideoDisc dvd) {
		if(qtyDVDs == 0) System.out.println("Store is null!");
		else {
			int j = 0;
			for(int i = 0; i < qtyDVDs ; i++) {
				//Nếu không phải là đĩa được chỉ định thì di chuyển nó lên phía trước 
				if ( !(itemsInStore[i].isMatch(dvd.getTitle()) ) ) {
					itemsInStore[j] = itemsInStore[i];
					j++;
				}
			}
			if(qtyDVDs == j) {
				System.out.println("The disc "+ dvd.getTitle() +" is not in the Store.");
			}else {
				qtyDVDs = j;
				System.out.println("The disc " + dvd.getTitle() + " has been removed.");
			}
		}
	}
}
