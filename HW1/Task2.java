package HW1;

import java.lang.reflect.Array;
import java.util.Scanner;

//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.println("Простые числа: ");
        for (int i = 2; i < n; ++i) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                System.out.print(i + " ");
        }
        in.close();
        System.out.println();

    }

}
