package week3.task2.a;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите email адрес:");

        Scanner emailScanner = new Scanner(System.in);
        String email = emailScanner.nextLine();


        System.out.println(isValidEmail(email));
    }
    public static boolean isValidEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }
}
