package OOP.HW4.Characters;

import OOP.HW4.LeftHand.TowerShield;
import OOP.HW4.RightHand.Sword;

public class Knight extends BaseClass<Sword, TowerShield> {
    public Knight(String name, int hp, Sword weapon, TowerShield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Knight: %s", super.toString());
    }
}
