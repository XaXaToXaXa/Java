import com.sun.security.auth.NTSidUserPrincipal;

import java.sql.PseudoColumnUsage;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int size = 10;
        int[] myArray = Task1.FillRandomArray(size);
        System.out.println("Исходный массив: ");
        Task1.PrintArray(myArray);
        Task1.mergeSort(myArray, size);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        Task1.PrintArray(myArray);
    }

}
