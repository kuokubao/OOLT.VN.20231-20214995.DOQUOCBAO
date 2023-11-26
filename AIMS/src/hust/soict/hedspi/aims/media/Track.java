package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    private float cost;

    public Track(String title, int length, float cost) {
        this.title = title;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Track: " + title + " - Length: " + length + " - Cost: " + cost + "$";
    }

    @Override
    public void play() {
        // Implement the play method according to your needs
        System.out.println("Playing Track: " + getTitle());
        System.out.println("Track length: " + getLength());
    }
}
