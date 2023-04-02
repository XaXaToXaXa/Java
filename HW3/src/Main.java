import com.sun.security.auth.NTSidUserPrincipal;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
//        int size = 10;
//        int[] myArray = Task1.FillRandomArray(size);
//        System.out.println("Исходный массив: ");
//        Task1.PrintArray(myArray);
//        Task1.mergeSort(myArray, size);
//        System.out.println();
//        System.out.println("Отсортированный массив: ");
//        Task1.PrintArray(myArray);
        Task2 task2 = new Task2();
        int listSize = 10;
        ArrayList<Integer> myList = new ArrayList<>();
        myList = Task2.FillRandomArrayList(listSize);
        System.out.println("Исходный список: ");
        Task2.PrintArrayList(myList);
        Task2.DeleteEvenNumber(myList);
        System.out.println();
        System.out.println("Cписок четных элементов: ");
        Task2.PrintArrayList(myList);

    }

}

