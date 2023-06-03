package OOP.HW7;

public class ComplexNumber{
    public int Re;
    public int Im;

    public ComplexNumber(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }
    @Override
    public String toString() {
        return String.format("%d + %1di", this.Re,this.Im);
    }



}