package week2.task2.b;


import java.util.Scanner;

public class Sqrt {
    static Double sqrt_geron(double a) {
        int i = 0;
        double b = a;
        while ((b*b > a) && (i < 200)) {
            b = (b+ a/b) / 2;
            i++;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Введите число (Integer): ");
        Scanner number_scanner = new Scanner(System.in);
        int number = number_scanner.nextInt();

        System.out.println(sqrt_geron(number));
    }
}