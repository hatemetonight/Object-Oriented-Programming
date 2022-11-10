package module1.week3.task1.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.println("Введите количество строк (N):");
        int countString =  inputInt.nextInt();

        System.out.println("Что ищем:");
        String searchString = inputStr.nextLine();

        String[] array = new String[countString];
        System.out.println("Где ищем:");

        for (int i = 0; i < countString; i++) {
            array[i] = inputStr.nextLine();
        }

        String resultString = String.join("" , array);
        System.out.println("Результат: " + count(resultString, searchString));
    }
    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }
}
