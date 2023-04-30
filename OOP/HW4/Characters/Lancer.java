package OOP.HW4.Characters;

import OOP.HW4.LeftHand.EmptySlot;
import OOP.HW4.RightHand.Lance;

import java.util.Random;

public class Lancer extends BaseClass<Lance, EmptySlot> {

    public Lancer(String name, int hp, Lance weapon, EmptySlot shield) {
        super(name, hp, weapon, shield);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Lancer: %s", super.toString());
    }
}

