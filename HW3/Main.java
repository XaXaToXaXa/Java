import com.sun.security.auth.NTSidUserPrincipal;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("Задание 1: Сортировка лиянием.");
        int size = 10;
        int[] myArray = Task1.FillRandomArray(size);
        System.out.println("Исходный массив: ");
        Task1.PrintArray(myArray);
        Task1.mergeSort(myArray, size);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        Task1.PrintArray(myArray);
        System.out.println();
        //
        Task2 task2 = new Task2();
        System.out.println("Задание 2: Удаление четных.");
        int listSize = 10;
        ArrayList<Integer> myList = new ArrayList<>();
        myList = Task2.FillRandomArrayList(listSize);
        System.out.println("Исходный список: ");
        Task2.PrintArrayList(myList);
        Task2.DeleteEvenNumber(myList);
        System.out.println();
        System.out.println("Cписок без четных элементов: ");
        Task2.PrintArrayList(myList);
        System.out.println();
        //
        Task3 task3 = new Task3();
        System.out.println("Задание 3: Вывод чисел.");
        int inListSize = 10;
        ArrayList<Integer> workList = new ArrayList<>();
        workList = Task2.FillRandomArrayList(inListSize);
        System.out.println("Исходный список: ");
        Task2.PrintArrayList(workList);
        int maxElement = Task3.findMax(workList);
        int minElement = Task3.findMin(workList);
        double avgElement = Task3.findAvg(workList);
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Среднее значение: " + avgElement);
    }

}



