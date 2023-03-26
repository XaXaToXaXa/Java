package HW1;

import java.util.Scanner;

// Реализовать простой калькулятор
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        System.out.print("Введите операцию (+ - / *): ");
        char operation = in.next().charAt(0);
        double res = 0;
        switch(operation) {
            case '+': res = num1 + num2;
               break;
            case '-': res = num1 - num2;
               break;
            case '*': res = num1 * num2;
               break;
            case '/': res = num1 / num2;
               break;
            default:  System.out.printf("Ошибка! Введите одну из предложенных операций (+ - / *)");
               return;
         }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + res);

        in.close();
    }
}
    

