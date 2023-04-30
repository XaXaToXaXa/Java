package OOP.HW4.LeftHand;

import OOP.HW4.Interfaces.Shield;

public class Buckler implements Shield {
    @Override
    public int block() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Bucklers blocks: %d.", block());
    }
}
