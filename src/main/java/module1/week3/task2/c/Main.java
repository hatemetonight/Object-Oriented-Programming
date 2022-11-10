package module1.week3.task2.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");

        Scanner repeatScanner = new Scanner(System.in);
        String repeat = repeatScanner.nextLine();
        System.out.println(funcRepeat(repeat));

    }
    public static String funcRepeat(String text) {
        text = text.replaceAll("([а-яa-z])\\1{2,}", "$1");

        return text;
    }
}
