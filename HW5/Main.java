package HW5;


import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //Task1
//        Task1.menu(Task1.phoneBook());
        //Task2
//        Task2.nameList();
        //Task3
        int[] myArray = Task3.fillArray(20);
        System.out.println("Исходный массив: ");
        Task3.printArray(myArray);
        Task3.sortArray(myArray);
        System.out.println("Отсортированный массив: ");
        Task3.printArray(myArray);

    }
}
