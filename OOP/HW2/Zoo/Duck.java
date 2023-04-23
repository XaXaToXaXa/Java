package OOP.HW2.Zoo;

public class Duck extends Herbivores implements Walkable, Flyable, Swimable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Duck: %s", super.toString());
    }

    @Override
    public String say() {
        return "Lisping speech";
    }

    @Override
    public int flySpeed() {
        return 80;
    }

    @Override
    public int walkSpeed() {
        return 5;
    }

    @Override
    public int swimSpeed() {
        return 5;
    }
}
