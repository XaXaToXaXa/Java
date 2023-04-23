package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Swimable;
import OOP.HW2.Aqua.Interface.Walkable;
import OOP.HW2.Aqua.Types.Shellfish;

public class Octopus extends Shellfish implements Walkable, Swimable {
    public Octopus(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Octopus: %s", super.toString());
    }

    @Override
    public int swimingSpeed() {
        return 140;
    }

    @Override
    public int movingSpeed() {
        return 10;
    }
}
