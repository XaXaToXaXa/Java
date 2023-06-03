package OOP.HW7;

public interface Calculable{
    Calculable sum(ComplexNumber CN);
    Calculable multi(ComplexNumber CN);
    ComplexNumber getResult();
}
