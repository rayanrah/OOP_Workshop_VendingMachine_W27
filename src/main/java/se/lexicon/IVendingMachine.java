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

    void addCurrency(int amount);

    int getBalance();

    Products request(int id);

    int endSession();

    String getDescription(int id);

    String[] getProducts();

}
