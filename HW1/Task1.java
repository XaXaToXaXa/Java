//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HW1;

import java.util.Scanner;

public class Task1 {
    static int triangle(int n) {
        if(n==1)         
            return 1;
        else
            return( n + triangle(n-1) );
    }
    static int factorial(int n) {
        if(n<=1)         
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Триугольное число от введенного = " + triangle(n));
        System.out.println("Факториал введенного = " + factorial(n));
    }
}    


