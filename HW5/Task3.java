package HW5;

import java.util.concurrent.ThreadLocalRandom;

//Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class Task3 {
    public static int[] fillArray(int n) {
        int[] array = new int[n];
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            array[i] = (randomNum.nextInt(0, 100));
        }
        return array;
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            HeapSort(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            HeapSort(array, i, 0);
        }
    }

    public static void HeapSort(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;
        if (r < n && array[r] > array[largest])
            largest = r;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            HeapSort(array, n, largest);
        }
    }
}
