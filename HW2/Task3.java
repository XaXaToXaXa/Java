package HW2;

// Дана json-строка (можно сохранить в файл и читать из файла)
//
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//
// Пример вывода:
//
//Студент Иванов получил 5 по предмету Математика.
//
//Студент Петрова получил 4 по предмету Информатика.
//
//Студент Краснов получил 5 по предмету Физика.
public class Task3 {


    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "").replace("}", "").replaceAll("\"", "").replace("[", "").replace("]", "");
        StringBuilder result = new StringBuilder();
        String[] arrayData = line1.split(",");
        String[] listName = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]).append(arrData[1]);
        }
        return result;
    }
}
