package lab02;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "Animation", 19.95, "Director1", 90);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Animation", 18.99, "Director2", 88);

        swap(jungleDVD, cinderellaDVD);

        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc tmp = dvd1;
        dvd1 = dvd2;
        dvd2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle, "Animation", 19.95, "Director1", 90);
    }
}
