package se.lexicon;

public class HealthyProducts extends Products {

    private boolean isItVegan;
    // Vitamin Water
    // Protein Bar
    // Mizex nuts


    public HealthyProducts(int id, double price, String productName, boolean isItVegan) {
        super(id, price, productName);
        this.isItVegan = isItVegan;
    }
}
