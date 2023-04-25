package OopSem4;

import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private String name;

    protected T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d", name, weapon, healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}
