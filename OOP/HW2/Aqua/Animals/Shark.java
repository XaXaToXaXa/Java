package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Swimable;
import OOP.HW2.Aqua.Types.Fish;

public class Shark extends Fish implements Swimable {
    public Shark(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Shark: %s", super.toString());
    }

    @Override
    public int swimingSpeed() {
        return 130;
    }
}
