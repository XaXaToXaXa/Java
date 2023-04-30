package OOP.HW4.RightHand;

import OOP.HW4.Interfaces.Weapon;

public class Sword implements Weapon {
    @Override
    public int damage() {
        return 18;
    }

    @Override
    public String toString() {
        return String.format("Swords damage: %d", damage());
    }
}
