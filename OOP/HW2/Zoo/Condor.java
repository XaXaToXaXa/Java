package OOP.HW2.Zoo;

public class Condor extends Predator implements Flyable, Walkable {

    public Condor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Condor: %s", super.toString());
    }

    @Override
    public String say() {
        return "Smoky voice";
    }

    @Override
    public int flySpeed() {
        return 120;
    }

    @Override
    public int walkSpeed() {
        return 10;
    }
}
