package OOP.HW7;

public class CalcLoggerFactory implements InterCalculableFactory{
    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculable create(int a, int b) {
        return new CalcLogger(new Calculator(new ComplexNumber(a, b)), loggable);
    }
}
