package hust.soict.hedspi.aims.CD;
import java.util.List;

public class CD {
	private int nbCD = 0;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public List<Track> getTrackList() {
		return trackList;
	}
	public void setTrackList(List<Track> trackList) {
		this.trackList = trackList;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	private int id;
	public String title;
	public String category;
	public String artist;
	public String director;
	public List<Track> trackList;
	private float price;
	public int length;
	
	public void showCD() {
		int count = 0;
		System.out.println("CD: " + this.title + " - " + this.category + " - " + this.artist + " - " + this.director + " - " + this.length + " - " + this.price);
		System.out.println("Track list: ");
		for (Track track : trackList) {
			System.out.println("Track " + count++ + " - " + track.getTitle() + " - " + track.getLength());
		}
	}
}
