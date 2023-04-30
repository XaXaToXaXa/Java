package OOP.HW4.Characters;

import OOP.HW4.Interfaces.Shield;
import OOP.HW4.Interfaces.Weapon;

import java.util.Random;

public abstract class BaseClass<W extends Weapon, S extends Shield> {
    private String name;
    private int hp;
    protected W weapon;
    protected S shield;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }


    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public BaseClass(String name, int hp, W weapon, S shield) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public int block() {
        Random random = new Random();
        return random.nextInt(shield.block());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, HP: %d, Right hand: %s, Left hand: %s", name, hp, weapon, shield);
    }
}
