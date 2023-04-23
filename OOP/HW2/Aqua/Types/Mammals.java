package OOP.HW2.Aqua.Types;

import OOP.HW2.Aqua.MarineLife;

public class Mammals extends MarineLife {
    public Mammals(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Mammals";
    }
}
