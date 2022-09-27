package week2.task1.a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст:");

        Scanner age_scanner = new Scanner(System.in);
        int age = age_scanner.nextInt();


        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = age + " год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old =  age + " лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = age + " года";
        if (exclusion)
            old = age + " лет";

        System.out.println(old);
    }
}
