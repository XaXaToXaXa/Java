package OOP.HW1.Vending;

public class Drink extends Product {

    private final Double volume;

    public Drink(String name, Integer cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + volume;
    }
}
