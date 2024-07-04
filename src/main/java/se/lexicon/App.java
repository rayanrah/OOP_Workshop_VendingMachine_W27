package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

public class App
{
    public static void main(String[] args) {

        // Created objects for Beverages.
        Beverages Beverages1 = new Beverages ("Cola", 12,false);
        Beverages Beverages2 = new Beverages ("Cola", 13,false);
        Beverages Beverages3 = new Beverages ("Cola", 15,true);

        System.out.println(Beverages1.getProductInformation());
        System.out.println(Beverages2.getProductInformation());
        System.out.println(Beverages3.getProductInformation());

        // Created objects for HealthyProducts.
        HealthyProduct HealthyProducts1 = new HealthyProduct("VitaminWater", 30,false);
        HealthyProduct HealthyProducts = new HealthyProduct("ProteinBar", 32, true);
        HealthyProduct HealthyProducts3 = new HealthyProduct("Mixednuts", 32,true);


        // Created objects for Snacks.
        Snacks Snacks1 = new Snacks (Size.SMALL,"PotatoChips");
        Snacks Snacks2 = new Snacks (Size.MEDIUM,"PotatoChips");
        Snacks Snacks3 = new Snacks (Size.LARGE,"PotatoChips");

        System.out.println(Snacks1.getProductInformation());
        System.out.println(Snacks2.getProductInformation());
        System.out.println(Snacks3.getProductInformation());

        System.out.println("==========================");
        System.out.println("Adding Products to Vending Machine: ");
        System.out.println("{Beverages1, Beverages2, Beverages3, Snacks3}");
        Product[] productForVM1 = new Product[] {Beverages1, Beverages2, Beverages3, Snacks3};

        VendingMachine vendingMachine1 = new VendingMachine(productForVM1);

        System.out.println("==========================");
        System.out.println("Welcome! Our Products available in the vending machine: ");
        System.out.println(Arrays.toString(vendingMachine1.getProducts()));

        System.out.println("==========================");
        int amount = 200;
        vendingMachine1.addCurrency(amount); // Add 200 currency to the deposit pool.;
        System.out.println("Current balance after adding currency: " + vendingMachine1.getBalance());
        System.out.println("==========================");
        vendingMachine1.request(3);
        System.out.println("Your order: " + vendingMachine1.request(3).getProductInformation());
        System.out.println("Your balance after buying product: " + vendingMachine1.getBalance());
        System.out.println("==========================");




    }
}
