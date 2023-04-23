package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Swimable;
import OOP.HW2.Aqua.Types.Mammals;

public class Dolphin extends Mammals implements Swimable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Dolphin: %s", super.toString());
    }

    @Override
    public int swimingSpeed() {
        return 120;
    }
}
