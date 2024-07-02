package se.lexicon;

public enum Size {
    // We use 'enum' when we have a fixed setup constant.
    // It contains: fields, Constructor, and Methods.
    //  You can not initialize it.
    //  The contents of enum 'final'.

    SMALL ("S", 20), MEDIUM ("M", 28.99), LARGE ("L",39.99 );
    // group of Constance values.

    private final String label;
    private final double price;

    Size(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }
}
