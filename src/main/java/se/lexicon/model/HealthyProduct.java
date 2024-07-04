package se.lexicon.model;

public final class HealthyProduct extends Product {
// ** Add "Final" class to only use this class for creating objects and not inheritance.

    private boolean isItVegan;


    public HealthyProduct(String productName, double price, boolean isItVegan) {
        super(productName, price);
        this.isItVegan = isItVegan;
    }
}
