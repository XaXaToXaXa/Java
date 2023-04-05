package HW4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
public class Task1 {

    public static LinkedList<Integer> fillList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static void printList(LinkedList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static LinkedList<Integer> reversList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer item : list) {
            reversed.addFirst(item);
        }
        return reversed;
    }
}



