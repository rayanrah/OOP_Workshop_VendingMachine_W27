package se.lexicon;

public class Beverages extends Products {

    private boolean isItSugerFree;

    // Cola
    // Lemonad
    // Iced Tea

    // Products: Id, Price, Productname.


    public Beverages(int id, double price, String productName, boolean isItSugerFree) {
        super(id, price, productName);
        this.isItSugerFree = isItSugerFree;
    }
}
