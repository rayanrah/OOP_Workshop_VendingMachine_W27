package se.lexicon;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.UUID;

public class Products {

    //--------------- Variables ---------------

    private static int nextId = 1; // Static variable to keep track of the next ID
    private int id;
    private String productName;
    private double price;

    // --------------- Constructor ---------------
    public Products(int id, double price, String productName) {
        this.id = nextId++; // Assign current nextId value and then increment nextId.
        this.price = price;
        this.productName = productName;
    }

    // --------------- Setters ---------------

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("productName can not be empty or null.");
        }
        this.productName = productName;
    }

    // --------------- Getter ---------------

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can not be negative or zero.");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    // Method to Print the product information.
    public String getProductInformation() {
        return "ID number: " + id + "Product: " + productName + "price: " + price;
    }


}
