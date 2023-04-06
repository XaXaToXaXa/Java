package HW4;

import java.util.LinkedList;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.
public class Task2 {
    public static void enqueue(LinkedList<Integer> list) {
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        list.addLast(i);
        scan.close();
    }
    public static void dequeue(LinkedList<Integer> list){
        int i = list.pollFirst();
        System.out.println("Элемент который удаляемый из списка: " + i);
    }
    public static void first(LinkedList<Integer> list){
        System.out.println("Первый элемент списка: " + list.peekFirst());
    }
}
