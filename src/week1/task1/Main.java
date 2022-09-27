package week1.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите свое имя: ");

        Scanner name = new Scanner(System.in);
        String user = name.nextLine();

        System.out.printf("Привет, %s!", user);

    }
}