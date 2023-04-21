package OOP.HW1.Coffee;

public class Tea extends Coffee {

    private Boolean sugar;

    public Tea(String name, Double volume, String temperature, Integer cost, Boolean sugar) {
        super(name, volume, temperature, cost);
        this.sugar = sugar;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + sugar;
    }
}
