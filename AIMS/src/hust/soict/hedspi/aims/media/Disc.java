package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    protected String director;
    protected int length;

    public Disc(int id, String title, String category, String director, float cost, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Disc - ID: " + getId() + " - Title: " + getTitle() + " - Category: " + getCategory() +
                " - Director: " + director + " - Cost: " + getCost() + "$ - Length: " + length + " mins";
    }
}
