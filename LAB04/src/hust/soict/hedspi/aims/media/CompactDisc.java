package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    

    public CompactDisc(String title, String category, float cost, String artist2) {
		super();
		// TODO Auto-generated constructor stub
	}



	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}



	public CompactDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}



	public CompactDisc(String category, String title, float cost) {
		super(category, title, cost);
		// TODO Auto-generated constructor stub
	}



	public CompactDisc(String director, String category, String title, float cost) {
		super(director, category, title, cost);
		// TODO Auto-generated constructor stub
	}



	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}



	public void addTrack(Track track) {
        if (this.tracks.contains(track)) {
            System.out.println("This track is already in the list.");
            return;
        }
        this.tracks.add(track);
        System.out.println("Track added successfully.");
    }

    public void removeTrack(Track track) {
        if (!this.tracks.contains(track)) {
            System.out.println("This track is not in the list.");
            return;
        }
        this.tracks.remove(track);
        System.out.println("Track removed successfully.");
    }

    @Override
    public void play() {
        System.out.println("Playing Compact Disc: " + this.getTitle());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return String.format("CD - %s - %s - %s - %d : %.2f $", getTitle(), getCategory(), getArtist(), getLength(), getCost());
    }

    @Override
    public Media playMedia(String title) {
        // TODO Auto-generated method stub
        return null;
    }

    public static CompactDisc createCD() {
        System.out.println("--- New CD ---");
        String title, category, artist, director;
        float cost;
        int nbTracks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter category: ");
        category = sc.nextLine();

        System.out.print("Enter artist: ");
        artist = sc.nextLine();

        System.out.print("Enter director: ");
        director = sc.nextLine();

        System.out.print("Enter cost: ");
        cost = sc.nextFloat();

        CompactDisc cd = new CompactDisc(title, category, cost, artist);

        System.out.print("Enter number of tracks: ");
        nbTracks = sc.nextInt();

        for (int i = 0; i < nbTracks; i++) {
            System.out.println("\nTrack no. " + (i + 1));
            cd.addTrack(Track.createTrack());
        }

        sc.close(); // Đóng Scanner

        return cd;
    }
}
