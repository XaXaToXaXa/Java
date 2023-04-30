package OOP.HW4.RightHand;

import OOP.HW4.Interfaces.Weapon;

public class Blunt implements Weapon {
    @Override
    public int damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Blunts damage: %d", damage());
    }
}
