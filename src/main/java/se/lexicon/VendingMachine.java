package se.lexicon;

import se.lexicon.model.Product;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine {

    // Array of valid currency amounts
    private final int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    // Array to store the products available in the vending machine.
    private final Product[] products;

    // Stores the current balance of the vending machine
    private int depositPool;

    // Constructor
    public VendingMachine(Product[] product) {
        this.products = product;
    }


    // Method to add currency to the deposit pool after validating the amount
    @Override
    public void addCurrency(int amount) {
        for (int validAmount : validAmounts) {
            if (validAmount == amount) {
                depositPool += amount; // Add the amount to the deposit pool if it is valid
                return;
            }
        }
        throw new IllegalArgumentException("Invalid currency amount. Accepted values are: " + Arrays.toString(validAmounts));
    }

    // Method to get the current balance in the deposit pool
    public int getBalance() {
        // Return the remaining balance in the deposit pool
        return depositPool;
    }

    // Method to request a product by its ID
    @Override
    public Product request(int id) {
        Product requestProduct = findProductById(id);
        if (requestProduct != null) {
            if (depositPool >= requestProduct.getPrice()) {
                depositPool -= (int) requestProduct.getPrice();
                return requestProduct;
            } else {
                throw new IllegalArgumentException("Insufficient funds. Please add more currency.");
            }
        }
        else {
            throw new IllegalArgumentException("Product not found. Please try again.");
        }
    }

    // Create a Method to find a product in the vending machine based on its ID.
    Product findProductById(int id) {
        for (Product findProductById : products) {
            if (findProductById.getId() == id) {
                return findProductById;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        return depositPool;
    }

    @Override
    public String getDescription(int id) {
        String description = "";
        for (Product item : products) {
            if (item.getId() == id) {
                description = item.getProductInformation();
            }
        }
        return description;
    }

    // Method to get descriptions of all products*
    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            Product productItem = products[i]; // Get each product
            productDescriptions[i] = "ID: " + productItem.getId() + ", Name: " + productItem.getProductName() + ", Price: " + productItem.getPrice(); // Store the product description
        }
        return productDescriptions; // Return the array of product descriptions
    }

}
