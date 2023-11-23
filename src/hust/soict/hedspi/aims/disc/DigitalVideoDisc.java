package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {

	// Tao cac thuoc tinh 
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	

	private static int nbDigitalVideoDisc = 0; // luu sô lượng dvd tạo ra
	
	private int id; 

	public int getId() {
		return id;
	}
	
	// Tao getter cho cac thuoc tinh private
	public String getTitle() {
		return title;
	}
	public String getCatagory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

	// Phuong thuc tao DVD object theo title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	// Phuong thuc tao DVD object theo title,category, director,length,cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	// Phuong thuc tao DVD object theo title,category,cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	// Phuong thuc tao DVD object theo director,category,title,cost
	public DigitalVideoDisc( String title, String category, String director, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	//phuong thuc toString() 
	public String toString() {
        return "DVD" +
               " - " + title +
               " - " + category +
               " - " + director +
               " - " + length +
               ": " + cost + "$";
    }

	//phuong thuc isMatch()
	public boolean isMatch(String title) {
		if( (this.title).equals(title) ) 
			return true;
		else return false;
	}
}
