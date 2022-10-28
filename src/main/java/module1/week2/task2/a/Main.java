package main.java.module1.week2.task2.a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите высоту пирамиды: ");
        Scanner height_scanner = new Scanner(System.in);
        int rows = height_scanner.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("#");
            }

            // Расстояние между двумя пирамидами
            System.out.print(" ");

            System.out.println("#".repeat(i));
        }
    }
}
