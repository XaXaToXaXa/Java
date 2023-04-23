package OOP.HW2.Zoo;

public class Whale extends Predator implements Swimable {

    public Whale(String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Whale: %s", super.toString());
    }

    @Override
    public String say() {
        return "Pfff";
    }

    @Override
    public int swimSpeed() {
        return 130;
    }
}
