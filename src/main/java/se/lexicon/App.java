package se.lexicon;

public class App
{
    public static void main(String[] args) {

        // Created objects for Beverages.
        Beverages Beverages1 = new Beverages ("Cola", 11.99,false);
        Beverages Beverages2 = new Beverages ("Cola", 12.49,false);
        Beverages Beverages3 = new Beverages ("Cola", 14.29,true);

        System.out.println(Beverages1.getProductInformation());
        System.out.println(Beverages2.getProductInformation());
        System.out.println(Beverages3.getProductInformation());

        // Created objects for HealthyProducts.
        HealthyProducts HealthyProducts1 = new HealthyProducts("VitaminWater", 29.30,false);
        HealthyProducts HealthyProducts = new HealthyProducts("ProteinBar", 29.30, true);
        HealthyProducts HealthyProducts3 = new HealthyProducts("Mixednuts", 29.30,true);


        // Created objects for Snacks.
        Snacks Snacks1 = new Snacks (Size.SMALL,"PotatoChips");
        Snacks Snacks2 = new Snacks (Size.MEDIUM,"PotatoChips");
        Snacks Snacks3 = new Snacks (Size.LARGE,"PotatoChips");

        System.out.println(Snacks1.getProductInformation());
        System.out.println(Snacks2.getProductInformation());
        System.out.println(Snacks3.getProductInformation());




    }
}
