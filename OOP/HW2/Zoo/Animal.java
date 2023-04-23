package OOP.HW2.Zoo;

public abstract class Animal implements Sayable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String type();

    @Override
    public String toString() {
        return String.format("My name: %s, My sound:  %s, My type: %s", name, say(), type());
    }
}
