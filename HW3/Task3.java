import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static int findMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int element : array) {
            if (element > max) max = element;
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int element : array) {
            if (element < min) min = element;
        }
        return min;
    }

    public static Double findAvg(ArrayList<Integer> array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        Double avg = Double.valueOf(sum) / Double.valueOf(array.size());
        return avg;

    }
}
