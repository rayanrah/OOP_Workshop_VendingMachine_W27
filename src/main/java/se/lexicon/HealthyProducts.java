package se.lexicon;

public final class HealthyProducts extends Products {
// ** Add "Final" class to only use this class for creating objects and not inheritance.

    private boolean isItVegan;


    public HealthyProducts(String productName, double price, boolean isItVegan) {
        super(productName, price);
        this.isItVegan = isItVegan;
    }
}
