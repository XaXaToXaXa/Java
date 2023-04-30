package OopSem4;

public class Assasin extends Warrior<Knife>{

    public Assasin(String name, Knife knife, int healthPoint) {
        super(name, knife, healthPoint);
    }
    
    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}
