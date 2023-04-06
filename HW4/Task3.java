package HW4;
//В калькулятор добавьте возможность отменить последнюю операцию.

import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static double getNumbers(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.nextDouble();
    }

    public static char getOperation(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.next().charAt(0);
    }

    public static void calc(double num1, char operation, double num2) throws IOException {
        Stack<Double> stack = new Stack<Double>();
        double res = 0;
        switch (operation) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> {
                System.out.print("Ошибка! Введите одну из предложенных операций (+ - / *)");
                return;
            }
        }
        System.out.println("Ответ = " + res);
        stack.push(res);
        while (true) {
            operation = getOperation("""
                    > Введите одну из предложенных операций (+ - / *)\s
                    > Введите Q для выхода\s
                    > Либо ведите "!" для отмены последнего действия\s""");
            switch (operation) {
                case '!' -> {
                    System.out.println("Удаленное значение: " + stack.pop());
                    res = (double) stack.peek();
                    System.out.println("Текущее значение: " + res);
                }
                case '+' -> res = res + getNumbers("Введите второе число: ");
                case '-' -> res = res - getNumbers("Введите второе число: ");
                case '*' -> res = res * getNumbers("Введите второе число: ");
                case '/' -> res = res / getNumbers("Введите второе число: ");
                case 'Q' -> {
                    System.out.print("До свидания.");
                    return;
                }
                default -> {
                    System.out.print("Ошибка! Введите одну из предложенных операций (+ - / *)");
                    return;
                }
            }
            stack.push(res);
            System.out.println("Ответ = " + res);
        }
    }
}
