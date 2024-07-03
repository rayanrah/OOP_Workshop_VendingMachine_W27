package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class VendingMachine implements IVendingMachine {

    private static int sequencer = 1; // Static variable to keep track of the next ID

    // Array of valid currency amounts
    private final int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    // Array to store the products available in the vending machine.
    private final Products[] product;

    // Stores the current balance of the vending machine
    private int depositPool = 0;

    // Constructor
    public VendingMachine(Products[] items) {
        LocalDateTime dateTime = LocalDateTime.now();
        int id = getNextId();
        this.product = items;
    }


    // Method to generate the ID: Increment and return the next ID
    private static int getNextId() {
        return sequencer++;
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
        // Reset the boughtProduct array to be empty
        Products[] boughtProduct = new Products[0];

        // Loop through each product in the vending machine
        for (Products item : product) {
            // Check if the product's price is less than or equal to the current balance
            if (item.getPrice() <= depositPool) {
                // Create a new array with one more slot than the current boughtProduct array
                Products[] newArray = new Products[boughtProduct.length + 1];

                // Copy the existing products in boughtProduct to the new array using a loop
                for (int i = 0; i < boughtProduct.length; i++) {
                    newArray[i] = boughtProduct[i];
                }
                // Add the current item to the end of the new array
                newArray[newArray.length - 1] = item;

                // Update the boughtProduct array to be the new array
                boughtProduct = newArray;

                // Subtract the product's price from the deposit pool
                depositPool -= item.getPrice();
            }
        }
        // Return the remaining balance in the deposit pool
        return depositPool;
    }

    // Method to request a product by its ID
    @Override
    public Products request(int id) {
        for (Products item : product) {
            if (item.getId() == id) {
                return item;
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
        for (Products item : product) {
            if (item.getId() == id) {
                description = item.getProductInformation();
            }
        }
        return description;
    }

    // Method to get descriptions of all products*
    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[product.length];
        for (int i = 0; i < product.length; i++) {
            Products productItem  = product[i]; // Get each product
            productDescriptions[i] = "ID: " + productItem .getId() + ", Name: " + productItem .getProductName() + ", Price: " + productItem .getPrice(); // Store the product description
        }
        return productDescriptions; // Return the array of product descriptions
    }

}
