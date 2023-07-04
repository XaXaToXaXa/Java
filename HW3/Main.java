import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        System.out.println("Задание 1: Сортировка лиянием.");
//        int size = 10;
//        int[] myArray = Task1.FillRandomArray(size);
//        System.out.println("Исходный массив: ");
//        Task1.PrintArray(myArray);
//        Task1.mergeSort(myArray, size);
//        System.out.println();
//        System.out.println("Отсортированный массив: ");
//        Task1.PrintArray(myArray);
//        System.out.println();
        //
        Task2 task2 = new Task2();
        System.out.println("Задание 2: Удаление четных.");
        int listSize = 10;
        ArrayList<Integer> myList;
        myList = task2.FillRandomArrayList(listSize);
        System.out.println("Исходный список: ");
        task2.PrintArrayList(myList);
        task2.DeleteEvenNumber(myList);
        System.out.println();
        System.out.println("Cписок без четных элементов: ");
        task2.PrintArrayList(myList);
        System.out.println();
        //
        Task3 task3 = new Task3();
        System.out.println("Задание 3: Вывод чисел.");
        int inListSize = 10;
        ArrayList<Integer> workList;
        workList = task2.FillRandomArrayList(inListSize);
        System.out.println("Исходный список: ");
        task2.PrintArrayList(workList);
        int maxElement = task3.findMax(workList);
        int minElement = task3.findMin(workList);
        double avgElement = task3.findAvg(workList);
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Среднее значение: " + avgElement);
    }

}



