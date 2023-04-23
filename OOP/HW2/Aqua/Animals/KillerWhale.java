package OOP.HW2.Aqua.Animals;

import OOP.HW2.Aqua.Interface.Swimable;
import OOP.HW2.Aqua.Types.Mammals;

public class KillerWhale extends Mammals implements Swimable {
    public KillerWhale(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Grampus: %s", super.toString());
    }

    @Override
    public int swimingSpeed() {
        return 125;
    }
}
