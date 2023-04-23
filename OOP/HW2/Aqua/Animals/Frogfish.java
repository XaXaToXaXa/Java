package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Walkable;
import OOP.HW2.Aqua.Types.Fish;

public class Frogfish extends Fish implements Walkable {
    public Frogfish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Frogfish: %s", super.toString());
    }

       @Override
    public int movingSpeed() {
        return 20;
    }
}
