package HW51;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static Map<String, List<String>> phoneBook() {
        Map<String, List<String>> book = new HashMap<>();
        book.put("Ivanov",List.of("5641321646","35133213"));
        book.put("Petrov",List.of("3543642346","2432134", "54134653"));
        book.put("Sidorov",List.of("54213416"));
        return book;
}
    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void find(Map<String, List<String>> phoneBook) {
        System.out.print("Имя абонента: ");
        String name = scan();
        System.out.println("Имя: " + name + "\nТелефон(ы): " + phoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> AllBook) {
        for (var item : AllBook.entrySet()) {
            System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
        }
    }

    public static void add(Map<String, List<String>> book) {
        System.out.print("Имя абонента: ");
        String name = scan();
        List<String> data = new ArrayList<>();
        while (true) {
            System.out.println("Если номеров больше нет, введите '0'");
            System.out.print("Введите номер: ");
            String number = scan();
            if (number.equals("0")) {
                break;
            } else {
                data.add(number);
            }
        }
        book.put(name, data);

    }

    public static Map<String, List<String>> menu(Map<String, List<String>> book) {
        while (true) {
            System.out.println("""
                          Меню:\s
                    1. Найти контакт\s
                    2. Добавить контакт\s
                    3. Печать телефонной книги\s
                    4. Выход""");
            System.out.print("\nВыберите пункт меню-> ");
            String commands = scan();
            if (commands.equals("4")) {
                System.exit(4);
                break;
            } else {
                switch (commands) {
                    case "1" -> find(book);
                    case "2" -> add(book);
                    case "3" -> allBook(book);
                    default -> System.out.println("Повторите ввод.");
                }
            }
        }
        return book;
    }
}
