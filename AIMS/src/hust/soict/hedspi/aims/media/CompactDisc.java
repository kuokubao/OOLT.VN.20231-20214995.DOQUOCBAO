package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, String artist, String director, float cost, ArrayList<Track> tracks) {
        super(id, title, category, director, cost, -1); // Assuming -1 for length since it's not directly provided for CDs
        this.artist = artist;
        this.tracks = tracks != null ? tracks : new ArrayList<>();
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks != null ? tracks : new ArrayList<>();
    }

    public float getPrice() {
        float totalPrice = 0;
        for (Track track : tracks) {
            totalPrice += track.getCost();
        }
        return totalPrice;
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void addTrack(Track track) {
        if (track != null) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    @Override
    public String toString() {
        StringBuilder tracksInfo = new StringBuilder();
        for (Track track : tracks) {
            tracksInfo.append(track).append("\n");
        }
        return "CompactDisc - ID: " + getId() + " - Title: " + getTitle() + " - Category: " + getCategory() +
                " - Artist: " + artist + " - Director: " + getDirector() + " - Price: " + getPrice() + "$" +
                "\nTracks:\n" + tracksInfo;
    }

    @Override
    public void play() {
        System.out.println("Playing CompactDisc: " + getTitle());
        System.out.println("CompactDisc length: " + getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
}
