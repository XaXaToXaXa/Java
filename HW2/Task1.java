package HW2;

import java.io.BufferedReader;
import java.io.FileReader;

// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {
    public static String[] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size += 1; // Считаем количество строк в файле
        }
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1; // Переносим строку в массив
        }
        br1.close();
        return listData;
    }

    public static StringBuilder LineInList(String line) {
        String line1 = line.replace("{", "").replace("}", "").replaceAll("\"", "");
        StringBuilder result = new StringBuilder("select * from students where: ");

        String[] arrayData = line1.split(", ");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if (!arrData[1].equals("null")) {
                if (i != 0) {
                    result.append(", ").append(arrData[0]).append(" = ").append(arrData[1]);
                } else {
                    result.append(arrData[0]).append(" = ").append(arrData[1]);
                }
            }

        }
        return result;
    }


}
