package lab02;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;
    private int id; // Instance attribute to store the unique ID
    private static int nbDigitalVideoDiscs = 0; // Class attribute to keep track of the number of DVDs

    public DigitalVideoDisc(String title, String category, double cost, String director, int length) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;

        // Update the class variable nbDigitalVideoDiscs and assign the ID
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    // Các phương thức getter và setter (nếu cần)
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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
    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
}
