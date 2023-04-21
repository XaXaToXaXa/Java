package OOP.HW1.Vending;

public class Chocolate extends Product {
    private final String flavor;

    public Chocolate(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + flavor;
    }
}
