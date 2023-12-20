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

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, String category, float cost, String artist, List<Track> tracks ) {
		super(title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		if (this.tracks.contains(track)) {
			System.out.print("This track is already in list");
			return;
		}
		this.tracks.add(track);
		System.out.print("Track added successfully");
		return;
	}
	
	public void removeTrack(Track track) {
		if (! this.tracks.contains(track)) {
			System.out.print("This track is not in list");
			return;
		}
		this.tracks.remove(track);
		System.out.print("Track removed successfully");
		return;
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
        return String.format("CD - %s - %s - %s - %d : %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

	@Override
	public Media playMedia(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static CompactDisc createCD() {
		System.out.println("---New CD---");
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
		sc.close();
		return cd;
	}
}
