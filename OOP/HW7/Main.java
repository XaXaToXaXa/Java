package OOP.HW7;

public class Main {

    public static void main(String[] args) {
        InterCalculableFactory calculableFactory = new CalcLoggerFactory(new Logger());
        View view = new View(calculableFactory);
        view.run();
    }
}