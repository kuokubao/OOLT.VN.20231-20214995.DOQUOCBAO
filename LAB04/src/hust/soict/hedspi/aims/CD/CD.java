package hust.soict.hedspi.aims.CD;

import java.util.List;

public class CD {
    private int id;
    private String title;
    private String category;
    private String artist;
    private String director;
    private List<Track> trackList;
    private float price;
    private int length;
    
    public int getNbCD() {
        return nbCD;
    }

    public void setNbCD(int nbCD) {
        this.nbCD = nbCD;
    }

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

    public void showCD() {
        int count = 0;
        System.out.println("CD: " + this.title + " - " + this.category + " - " + this.artist + " - " + this.director + " - " + this.length + " - " + this.price);
        System.out.println("Track list: ");
        for (Track track : trackList) {
            System.out.println("Track " + count++ + " - " + track.getTitle() + " - " + track.getLength());
        }
    }
}
