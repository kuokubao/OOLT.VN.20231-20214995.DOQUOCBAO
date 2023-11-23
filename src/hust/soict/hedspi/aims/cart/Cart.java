package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDER = 20; // Số lượng max của giỏ hàng
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDER]; // Khai báo dưới 1 mảng
	
	private int qtyOrdered = 0;
	

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDER) {      // kiểm tra xem giỏ hàng đã đầy chưa
			System.out.println("Cart is almost full.");
		}else {
			itemOrdered[qtyOrdered] = disc;     // nếu chưa thì thêm vào giỏ
			qtyOrdered++;
			System.out.println("The disc "+ disc.getTitle() + " has been added.");
		}
	}

	// phương thức removo dvd
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) System.out.println("Cart is null!");
		else {
			int j = 0;
			for(int i = 0; i < qtyOrdered ; i++) {
				//Nếu không phải là đĩa được chỉ định thì di chuyển nó lên phía trước giỏ hàng
				if ( !((itemOrdered[i].getTitle()).equals(disc.getTitle())) ) {
					itemOrdered[j] = itemOrdered[i];
					j++;
				}
			}
			if(qtyOrdered == j) {
				System.out.println("The disc "+ disc.getTitle() +" is not in the cart.");
			}else {
				qtyOrdered = j;
				System.out.println("The disc " + disc.getTitle() + " has been removed.");
			}
		}
	}
	
	// Phương thức tính tổng tiền của giỏ hàng
	public float totalCost() {
	    float cost = 0;
	    for(int i = 0; i < qtyOrdered; i++) {
	        cost += itemOrdered[i].getCost(); // Change this line
	    }
	    return cost;
	}

	
	//overloading 

	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for(int i = 0; i < dvdList.length; i++) {
			if(qtyOrdered >= MAX_NUMBERS_ORDER) {      // kiểm tra xem giỏ hàng đã đầy chưa
				System.out.println("Cart is almost full.");
				break;
			}else {
				itemOrdered[qtyOrdered] = dvdList[i];     // nếu chưa thì thêm vào giỏ
				qtyOrdered++;
				System.out.println("The disc "+ dvdList[i].getTitle() + " has been added.");
			}
		}
	}
	
	//Bui Ta Duc 20215035
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if (qtyOrdered + 2 > MAX_NUMBERS_ORDER) { // kiểm tra xem có đủ chỗ cho 2 DVDs
            System.out.println("Cart is almost full.");
            return;
        }

        itemOrdered[qtyOrdered] = dvd1;
        qtyOrdered += 1;
        System.out.println("The disc " + dvd1.getTitle() + " has been added.");

        itemOrdered[qtyOrdered] = dvd2;
        qtyOrdered += 1;
        System.out.println("The disc " + dvd2.getTitle() + " has been added.");

	}
  
    public void print() {
    	System.out.println();
    	System.out.println("**************CART**************");
    	System.out.println("Ordered Items");
    	for (int i = 0; i < qtyOrdered; i++) {
     		System.out.print(i+1 +". " +  itemOrdered[i].toString() ); // Dùng toString()
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println("Total cost: "+ totalCost()); 
    	System.out.println("********************************");
    }
	
    public void searchById(int id) {
    	boolean found = false; //tạo 1 biến kiểm tra xem có tìm thấy không
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemOrdered[i].getId() == id) {
    			System.out.println("Found DVD with ID: " + id);
    			found = true;  // có thi print và thoát vòng lặp
    			System.out.println(itemOrdered[i].toString());
    			break;
    		}
    	}
    	if(found == false) System.out.println("No match found for DVD with ID: " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                System.out.println("Tìm thấy DVD với tiêu đề: " + title);
                System.out.println(itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy đĩa DVD có tiêu đề: " + title);
        }
    }
}
