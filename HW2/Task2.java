package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task2 {
    public static int[] fillArray(int n) {
        int[] array = new int[n];
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            array[i] = (randomNum.nextInt(-10, 10));
        }
        return array;
    }
    public static void sort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("Task2log.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());

        logger.log(Level.INFO, "Первоначальный массив: " + Arrays.toString(arr) + "\n");
        boolean sorted = false;
        while (!sorted) {
            int count = 0;
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            logger.log(Level.INFO, "Сортировка массива:" + Arrays.toString(arr) + "\n");
        }
        logger.log(Level.INFO, "Отсортированный массив: " + Arrays.toString(arr) + "\n");
        file.close();
    }
}
