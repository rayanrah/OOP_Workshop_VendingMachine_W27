package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class VendingMachine implements IVendingMachine {

    private static int sequencer = 1; // Static variable to keep track of the next ID

    // Array of valid currency amounts
    private final int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    private int id;

    private LocalDateTime dateTime;

    // Array to store the products available in the vending machine.
    private Products[] items;

    // Stores the current balance of the vending machine
    private int depositPool = 0;

    // Constructor
    public VendingMachine() {
        this.dateTime = LocalDateTime.now();
        this.id = getNextId();
        this.items = new Products[0];
    }


    // Method to generate the ID: Increment and return the next ID
    private static int getNextId() {
        return sequencer++;
    }

    // Helper method to check if the given amount is valid
    private boolean isValidAmount(int amount) {
        for (int validAmount : validAmounts) {
            if (validAmount == amount) {
                return true; // Return true if the amount is valid
            }
        }
        return false; // Return false if the amount is not valid
    }

    // Method to add currency to the deposit pool
    @Override
    public void addCurrency(int amount) {
        if (isValidAmount(amount)) {
            depositPool += amount;
        } else {
            throw new IllegalArgumentException("Invalid currency amount. Accepted values are: " + Arrays.toString(validAmounts));
        }
    }

    // Method to get the current balance in the deposit pool
    @Override
    public int getBalance() {
        return depositPool;
    }

    // Method to request a product by its ID
    @Override
    public Products request(int id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return "";
    }

    // Method to get descriptions of all products
    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            Products product = items[i]; // Get each product
            productDescriptions [i] = "ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice(); // Store the product description
        }
        return productDescriptions; // Return the array of product descriptions
    }



}
