package OOP.HW4.RightHand;

import OOP.HW4.Interfaces.Weapon;

public class Lance implements Weapon {

    public int range(){
        return 10;
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Lances damage: %d, range: %d", damage(), range());
    }
}
