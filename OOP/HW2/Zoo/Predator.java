package OOP.HW2.Zoo;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    public String type(){
        return "Predator";
    }

}
