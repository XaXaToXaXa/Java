import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {

    public static ArrayList<Integer> FillRandomArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static void PrintArrayList(ArrayList<Integer> array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void DeleteEvenNumber(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}
