package hust.soict.hedspi.aims.media;

public class CD extends Media implements Item {
    private String artist;
    private String director;
    private String[] trackList;

    public CD(int id, String title, String category, float cost, String artist, String director, String[] trackList) {
        super(id, title, category, cost);
        this.artist = artist;
        this.director = director;
        this.trackList = trackList;
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

    public String[] getTrackList() {
        return trackList;
    }

    public void setTrackList(String[] trackList) {
        this.trackList = trackList;
    }

    
    @Override
    public String toString() {
        StringBuilder cdDetails = new StringBuilder();
        cdDetails.append("CD - ID: ").append(getId()).append(" - Title: ").append(getTitle())
                .append(" - Category: ").append(getCategory()).append(" - Cost: ").append(getCost()).append("$")
                .append(" - Artist: ").append(artist).append(" - Director: ").append(director)
                .append("\nTrackList:\n");
        
        for (int i = 0; i < trackList.length; i++) {
            cdDetails.append("\t").append(i + 1).append(". ").append(trackList[i]).append("\n");
        }
        
        return cdDetails.toString();
    }


    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public float getCost() {
        return super.getCost();
    }
}
