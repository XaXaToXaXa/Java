package OOP.HW2.Zoo;

public class FlyingFish extends Predator implements Swimable, Flyable{
    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Flying fish: %s", super.toString());
    }

    @Override
    public String say() {
        return "Hmmm";
    }
    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public int swimSpeed() {
        return 50;
    }
}
