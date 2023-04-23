package OOP.Seminar2.src;

public abstract class Herbivores extends Animal{
    public Herbivores(String name) {
        super(name);
    }
    public String feed(){
        return "grass";
    }
}
