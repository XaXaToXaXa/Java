package OOP.Seminar2.src;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    public String feed(){
        return "meat";
    }

}
