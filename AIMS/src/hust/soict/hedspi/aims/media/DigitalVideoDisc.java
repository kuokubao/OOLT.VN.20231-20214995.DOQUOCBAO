package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc(int id, String title, String category, String director, float cost, int length) {
        super(id, title, category, director, cost, length);
        nbDigitalVideoDisc++;
    }
    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }


    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength() + " mins");
    }
}
