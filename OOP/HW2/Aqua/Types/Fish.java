package OOP.HW2.Aqua.Types;

import OOP.HW2.Aqua.MarineLife;

public class Fish extends MarineLife {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Fish";
    }
}
