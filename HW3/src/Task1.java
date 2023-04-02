
//Реализовать алгоритм сортировки слиянием
import java.lang.Math;
import java.lang.System;
public class Task1 {

    public static int[] FillRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        return array;
    }

    public static void mergeSort(int [] array, int n){
        if (n<2) return;
        int mid = n/2;
        int [] leftArr = new int[mid];
        int [] rightArr = new int[n-mid];
        System.arraycopy(array, 0, leftArr, 0, mid);
        System.arraycopy(array, mid, rightArr, 0, n - mid);
        mergeSort(leftArr, mid);
        mergeSort(rightArr, n - mid);
        merge(array, leftArr, rightArr, mid, n - mid);
    }

    public static void merge(int[] array, int[] leftArr, int [] rightArr, int leftLength, int rightLength){
        int k=0, i=0, j=0;
        while (i < leftLength && j < rightLength){
            if(leftArr[i] <= rightArr[j]) array[k++] = leftArr[i++];
            else array[k++] = rightArr[j++];
        }
        while (i < leftLength){
            array[k++] = leftArr[i++];
        }
        while (j < rightLength){
            array[k++] = rightArr[j++];
        }
    }

}
