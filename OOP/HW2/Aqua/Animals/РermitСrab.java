package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Walkable;
import OOP.HW2.Aqua.Types.Shellfish;

public class РermitСrab extends Shellfish implements Walkable {
    public РermitСrab(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Permit crab: %s", super.toString());
    }

    @Override
    public int movingSpeed() {
        return 12;
    }
}
