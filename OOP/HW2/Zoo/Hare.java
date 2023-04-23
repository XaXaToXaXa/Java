package OOP.HW2.Zoo;

public class Hare extends Herbivores implements Walkable {
    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Sarcastic joke";
    }

    @Override
    public String toString() {
        return String.format("Hare: %s", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 25;
    }
}
