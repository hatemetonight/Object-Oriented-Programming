package main.java.module1.week2.task1.b;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите год:");

        Scanner date_scanner = new Scanner(System.in);
        int year = date_scanner.nextInt();
        System.out.println("Введите номер месяца:");

        int month = date_scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("В %s месяце 31 день" , month);
                break;
            case 2:
                if (year %4 == 0 && year % 100 !=0 || year % 400 == 0)
                    System.out.printf("В %s месяце 29 дней", month);
                else
                    System.out.printf("В %s месяце 28 дней", month);
                break;

            case 4, 6, 9, 11:
                System.out.printf("В %s месяце 30 дней" , month);
                break;
        }

    }
}
