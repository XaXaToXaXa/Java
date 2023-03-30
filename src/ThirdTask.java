import java.util.Scanner;

public class ThirdTask {


    public String reverse(String string) {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; --i) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    public void getResult(String string) {
        if (isPalindrome(string)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}

/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */
