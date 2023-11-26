package hust.soict.hedspi.aims.media;

public class Book implements Item {
    private int id;
    private String title;
    private String category;
    private float cost;
    private String[] authors;

    public Book(int id, String title, String category, float cost, String[] authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }

    // Implement methods from the Item interface
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public float getCost() {
        return cost;
    }

    // Getters and setters for authors
    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    // Override toString() method
    @Override
    public String toString() {
        String authorsList = String.join(", ", authors);
        return "Book - ID: " + id + " - " + title + " - " + category + " - " + cost + "$ - Authors: " + authorsList;
    }
}
