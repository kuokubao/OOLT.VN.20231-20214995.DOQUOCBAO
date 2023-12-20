package hust.soict.hedspi.aims.media;

import java.util.Objects;
import java.util.Scanner;

public class Track implements Playable {

	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.length = length;
	}
	
	@Override
    public void play() {
        // Implementation specific to playing a Track
        System.out.println("Playing Track: " + title);
    }
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track otherTrack = (Track) obj;
        return Objects.equals(title, otherTrack.title) && length == otherTrack.length;
    }

	@Override
	public Media playMedia(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Track createTrack() {
		String title;
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter track title: ");
		title = sc.nextLine();
		
		System.out.print("Enter track length: ");
		length = sc.nextInt();
		
		sc.close();
		return new Track(title, length);
	}
}
