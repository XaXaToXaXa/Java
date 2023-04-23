package OOP.HW2.Aqua.Types;

import OOP.HW2.Aqua.MarineLife;

public class Shellfish extends MarineLife {
    public Shellfish(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "ShellFish";
    }
}
