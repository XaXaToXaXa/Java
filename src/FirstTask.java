import java.util.Scanner;

public class FirstTask {
    int n;
    char a;
    char b;
    int count = 0;

    FirstTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четное число");
        n = in.nextInt();
        System.out.println("Введите два символа");
        a = in.next().charAt(2);
        b = in.next().charAt(2);
        in.close();
    }

    public boolean isOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            System.out.println("Введенное число n - нечетно");
            return false;
        }
    }

    public void getResult() {
        if (isOdd(n)) {
            StringBuilder result = new StringBuilder();
            while (n != count) {
                result.append(a).append(b);
                count = count + 2;
            }
            System.out.println(result);
        }
    }
}

/*
Дано четное число N (>0) и символы a и b.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов a и b, начиная с a.
 */
