package OOP.HW7;

public class CalculableFactory implements InterCalculableFactory {
    public Calculable create(int a, int b) {
        ComplexNumber CN = new ComplexNumber(a, b);
        return new Calculator(CN);
    }
}
