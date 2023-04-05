package HW4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Task 1
        LinkedList<Integer> taskList = Task1.fillList(11);
        System.out.println("Start list: ");
        Task1.printList(taskList);
        System.out.println("-------");
        System.out.println("Reversed list: ");
        Task1.printList(Task1.reversList(taskList));
        System.out.println("-------");

    }
}
