package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализовать простой калькулятор
public class Task4 {

    public static void calc(double num1, double num2, char operation) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("D:\\Git\\Java\\HW2\\Calclog.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        logger.log(Level.INFO, "Введены данные: " + num1 + " " + operation + " " + num2 + "\n");
        double res = 0;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введите одну из предложенных операций (+ - / *)");
                return;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + res);
        logger.log(Level.INFO, "Операция и результат: " + num1 + " " + operation + " " + num2 + " = " + res + "\n");
        file.close();
    }
}


    

