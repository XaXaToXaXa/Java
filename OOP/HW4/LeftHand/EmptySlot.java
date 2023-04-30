package OOP.HW4.LeftHand;

import OOP.HW4.Interfaces.Shield;

public class EmptySlot implements Shield {
    @Override
    public int block() {
        return 1;
    }

    @Override
    public String toString() {
        return "Empty slot can`t block.";
    }
}
