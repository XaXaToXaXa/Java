package HW5;

import java.util.HashMap;
import java.util.Map;

//
//Пусть дан список сотрудников:
//        Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова
//        Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова
//        Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Иван Ежов
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
public class Task2 {
public static void nameList(){
    Map<String, Integer> listWorkers = new HashMap<>();
    String workers = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова " +
            "Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова " +
            "Марина Светлова Мария Савина Мария Рыкова Марина Лугова " +
            "Анна Владимирова Иван Мечников Петр Петин Иван Ежов ";
    String[] NamesSurnames = workers.split(" ");
    for (int i = 0; i < NamesSurnames.length; i += 2) {
        if (listWorkers.containsKey(NamesSurnames[i])) {
            listWorkers.replace(NamesSurnames[i], listWorkers.get(NamesSurnames[i]) + 1);
        } else {
            listWorkers.put(NamesSurnames[i], 1);
        }
    }
    System.out.println("\nСписок имен:");
    System.out.println(listWorkers);

    System.out.println("\nСписок имен по популярности:");
    listWorkers.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(System.out::println);
}
}
