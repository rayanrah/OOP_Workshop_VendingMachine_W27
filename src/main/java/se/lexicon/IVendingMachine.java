package se.lexicon;

/* info:
Interface is a Contract that define a group of abstract methods.
- We can not initialize interface (methods with no implementation.)
- It contains:
1.Static Methods.
2. Default Methods.
3. Abstract methods.
4.Static final fields.
 */

public interface IVendingMachine {

    // Method to add currency to the vending machine.
    void addCurrency(int amount);

    // Method to get the current balance in the vending machine
    int getBalance();

    // Method to request a product from the vending machine based on its ID.
    Products request(int id);

    // Method to end the current session and return any remaining balance
    int endSession();

    // Method to get the description of a product based on its ID.
    String getDescription(int id);

    // Method to get an array of products available in the vending machine.
    String[] getProducts();

}
