package OOP.HW2.Zoo;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }
    public String type(){
        return "Herbivores";
    }
}
