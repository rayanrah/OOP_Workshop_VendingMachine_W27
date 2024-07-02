package se.lexicon;

public final class Beverages extends Products {
// ** Add "Final" class to only use this class for creating objects and not inheritance.
    private boolean isItSugerFree;

    public Beverages(String productName, double price, boolean isItSugerFree) {
        super(productName, price);
        this.isItSugerFree = isItSugerFree;
    }


    public String getSugarInfo() {
        if (isItSugerFree) {
            return "YES! This product is sugar-free.";
        } else {
            return "NO! This product contains sugar.";
        }
    }


    @Override // Overriding method from Products (Parent).
    public String getProductInformation() {
        return "ID number:" + super.getId() + " - Product:" + super.getProductName() + " - price:" + super.getPrice() + "Is it suger-free: " + getSugarInfo();
    }

}
