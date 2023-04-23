package OOP.HW2.Aqua;

public abstract class MarineLife {
    private String name;

    public MarineLife(String name) {
        this.name = name;
    }
    public abstract String type();

    @Override
    public String toString() {
        return String.format("My name is %s and i`m %s ", name, type());
    }
}
