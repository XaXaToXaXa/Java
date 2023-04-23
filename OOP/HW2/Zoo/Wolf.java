package OOP.HW2.Zoo;

public class Wolf extends Predator implements Walkable, Swimable {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Woof woof";
    }

    @Override
    public String toString() {
        return String.format("Wolf: %s", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 40;
    }

    @Override
    public int swimSpeed() {
        return 10;
    }
}
