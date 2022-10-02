package week3.task1.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input_int = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);

        System.out.println("Введите количество строк (N):");
        int count_string =  input_int.nextInt();

        System.out.println("Что ищем:");
        String search_string = input_str.nextLine();

        String[] array = new String[count_string];
        System.out.println("Где ищем:");

        for (int i = 0; i < count_string; i++) {
            array[i] = input_str.nextLine();
        }

        String result_string = String.join("" , array);
        System.out.println("Результат: " + count(result_string, search_string));
    }
    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }
}
