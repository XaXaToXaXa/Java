package OOP.HW4.LeftHand;

import OOP.HW4.Interfaces.Shield;

public class TowerShield implements Shield {
    @Override
    public int block() {
        return 18;
    }

    @Override
    public String toString() {
        return String.format("Towers shield blocks: %d.", block());
    }
}
