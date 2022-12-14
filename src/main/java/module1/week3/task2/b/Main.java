package module1.week3.task2.b;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите IPv6 адрес:");

        Scanner ipv6Scanner = new Scanner(System.in);
        String ipv6 = ipv6Scanner.nextLine();


        System.out.println(isValidIPv6(ipv6));
    }
    public static boolean isValidIPv6(String ipv6) {
        if ((ipv6 != null) && (!ipv6.isEmpty())) {
            return Pattern.matches("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$", ipv6);
        }
        return false;
    }
}
