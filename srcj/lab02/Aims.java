package lab02; 

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
    
        // Create three DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, "Roger Allers", 87);
        anOrder.addDigitalVideoDisc(dvd1);
    
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, "George Lucas", 87);
        anOrder.addDigitalVideoDisc(dvd2);
    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f, "Unknown", 90);
        anOrder.addDigitalVideoDisc(dvd3);
    
        // Display the initial cart
        System.out.println("Initial Cart:");
        anOrder.displayCart();
    
        // Remove a specific DVD from the cart
        System.out.println("Removing 'Star Wars' from the cart...");
        anOrder.removeDigitalVideoDisc(dvd2);
    
        // Display the updated cart
        System.out.println("Updated Cart:");
        anOrder.displayCart();
    }
    
}

