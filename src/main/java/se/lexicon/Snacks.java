package se.lexicon;

public class Snacks extends Products { // use 'extends' to access the elements in Products class.
// ** Add "Final" class to only use this class for creating objects and not inheritance.

    private Size size;


    public Snacks(Size size, String productName) {
        super(productName, size.getPrice());
        this.size = size;
    }

    @Override // Overriding method from Products (Parent).
    public String getProductInformation() {
        return "ID number:" + super.getId() + " - Product:" + super.getProductName() + " - price:" + size.getPrice() + " - Size: " + size.getLabel();
    }

}
