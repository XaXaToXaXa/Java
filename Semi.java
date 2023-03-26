import java.util.Scanner;

public class Semi {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Введите имя: ");
        // String name = in.nextLine();
        // System.out.print("Введите возраст: ");
        // int age = in.nextInt();
        // System.out.print("Введите вес: ");
        // float height = in.nextFloat();
        // System.out.printf("Name: %s Age: %d Height: %.1f \n", name, age, height);
        // in.close();

        // Дан массив двоичных чисел, например [1,1,0,1,1,1],
        // вывести максимальное количество подряд идущих 1.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Entr size array: ");
        int size = in.nextInt();
        int[] arrayNum = new int[size]; // { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print("Enter number: ");
            arrayNum[i] = in.nextInt();
            if (arrayNum[i] == 1) {
                count++;
                if (max < count)
                    max = count;
            } else
                count = 0;
        }
        System.out.printf("Максиальное кол-во единиц подряд = %d \n", max);
        in.close();
    }

}
