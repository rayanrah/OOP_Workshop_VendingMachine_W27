package se.lexicon;

public class Snacks extends Products { // use 'extends' to access the elements in Products class.

    private String flavor;
    // Potato Chips
    // Chockolate Bar
    // Trial Mix


    public Snacks(int id, double price, String productName, String flavor) {
        super(id, price, productName);
        this.flavor = flavor;
    }
}
