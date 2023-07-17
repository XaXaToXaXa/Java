import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.age = 5;
        cat1.color = "Черный";
        cat1.name = "Луна";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.age = 9;
        cat2.color = "Синий";
        cat2.name = "Хэппи";

        Cat cat3 = new Cat();
        cat3.id = 3;
        cat3.age = 7;
        cat3.color = "Полосаный";
        cat3.name = "Матроскин";

        Cat cat4 = new Cat();
        cat4.id = 4;
        cat4.age = 9;
        cat4.color = "Рыжый";
        cat4.name = "Чубайс";

        Cat cat5 = new Cat();
        cat5.id = 5;
        cat5.age = 2;
        cat5.color = "Белый";
        cat5.name = "Полночь";

        Cat cat6 = new Cat();
        cat6.id = 4;
        cat6.age = 9;
        cat6.color = "Рыжый";
        cat6.name = "Чубайс";

        System.out.println(cat6);
        var cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
        System.out.println(cats);
        System.out.println(cat1.equals(cat5));
        System.out.println(cats.contains(cat6));
        System.out.println(cats);
    }
}
