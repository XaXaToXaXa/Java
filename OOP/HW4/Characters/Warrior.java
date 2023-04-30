package OOP.HW4.Characters;

import OOP.HW4.LeftHand.Buckler;
import OOP.HW4.RightHand.Blunt;

public class Warrior extends BaseClass<Blunt, Buckler> {
    public Warrior(String name, int hp, Blunt weapon, Buckler shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Warrior: %s", super.toString());
    }
}
