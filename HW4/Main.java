package HW4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Task 1
//        LinkedList<Integer> taskList = Task1.fillList(11);
//        System.out.println("Start list: ");
//        Task1.printList(taskList);
//        System.out.println("-------");
//        System.out.println("Reversed list: ");
//        Task1.printList(Task1.reversList(taskList));
//        System.out.println("-------");
        //Task 2
        LinkedList<Integer> task2List = Task1.fillList(11);
        System.out.println("First list: ");
        Task1.printList(task2List);
        Task2.enqueue(task2List);
        System.out.println("List with added number: ");
        Task1.printList(task2List);
        Task2.dequeue(task2List);
        System.out.println("List after removing first number: ");
        Task1.printList(task2List);
        Task2.first(task2List);
        System.out.println("Final list: ");
        Task1.printList(task2List);
    }
}
