package OOP.HW2.Zoo;

public class Tuna extends Predator implements Swimable {
    public Tuna(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Tuna: %s", super.toString());
    }

    @Override
    public String say() {
        return "Awkward silence";
    }

    @Override
    public int swimSpeed() {
        return 190;
    }

}
