package week3.task2.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");

        Scanner repeat_scanner = new Scanner(System.in);
        String repeat = repeat_scanner.nextLine();
        System.out.println(func_repeat(repeat));

    }
    public static String func_repeat(String text) {
        text = text.replaceAll("([а-яa-z])\\1{2,}", "$1");

        return text;
    }
}
