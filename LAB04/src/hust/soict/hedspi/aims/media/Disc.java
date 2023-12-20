package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	
	
	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Disc() {
		
	}
	public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }
	public Disc(String title) {
		super(title);
	}
	public Disc(String director, String category, String title, float cost) {
		super(category, title, cost);
		this.director = director;
	}
	public Disc(String category, String title, float cost) {
		super(category, title, cost);
	}
	public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
}
