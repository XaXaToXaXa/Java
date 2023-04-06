package HW4;

import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Task 1
//        LinkedList<Integer> taskList = Task1.fillList(11);
//        System.out.println("Изначальный список: ");
//        Task1.printList(taskList);
//        System.out.println("-------");
//        System.out.println("Развернутый список: ");
//        Task1.printList(Task1.reversList(taskList));
//        System.out.println("-------");
        //Task 2
//        LinkedList<Integer> task2List = Task1.fillList(11);
//        System.out.println("Изначальный список: ");
//        Task1.printList(task2List);
//        Task2.enqueue(task2List);
//        System.out.println("Список с добавленным в конце элементом: ");
//        Task1.printList(task2List);
//        Task2.dequeue(task2List);
//        System.out.println("Список после удаления первого элемента: ");
//        Task1.printList(task2List);
//        Task2.first(task2List);
//        System.out.println("Последний вариант списка: ");
//        Task1.printList(task2List);
        //Task 3
          Task3.calc(Task3.getNumbers("Введите первое число: "), Task3.getOperation("Введите одну из предложенных операций (+ - / *)"), Task3.getNumbers("Введите второе число: "));

    }
}
