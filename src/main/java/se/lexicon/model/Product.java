package se.lexicon.model;

public abstract class Product {
    //make the class "Abstract" to make it only for inheritance and not creating an object.

    //--------------- Variables ---------------

    private static int sequencer = 1; // Static variable to keep track of the next ID
    private int id;
    private String productName;
    private double price;
    // We add 'Final' to make it read-only and not changeable.

    // --------------- Constructor ---------------
    public Product(String productName, double price) {
        this.id = getNextId(); // Assign current nextId value and then increment nextId.
        this.price = price;
        this.productName = productName;
    }


    // --------------- Setters ---------------

    // Method to generate the ID: Increment and return the next ID
    private static int getNextId() {
        return sequencer++;
    }

    public String getProductName() {
        return productName;
    }

    // --------------- Getter ---------------

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("productName can not be empty or null.");
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can not be negative or zero.");
        }
        this.price = price;
    }

    // --------------- Methods ---------------

    public int getId() {
        return id;
    }

    // Method to Print the product information.
    // Added "Protected" to make it only available for Sub-classes.
    public String getProductInformation() {
        return "ID number:" + id + " - Product:" + productName + "Size: " + " - price:" + price;
    }


}
