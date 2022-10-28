package main.java.module1.week2.task1.c;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String weekday = input.nextLine();
        if (weekday.equals("Воскресенье" ) || weekday.equals("воскресенье")) {
            System.out.println("Температура? (жарко/тепло/холодно): ");
            String temperature = input.nextLine();
            if (temperature.equals("Жарко") || temperature.equals("жарко") || temperature.equals("Тепло") || temperature.equals("тепло")){
                System.out.println("Осадки? (ясно, облачно, дождь, снег, град): ");
                String precipitation = input.nextLine();
                if (precipitation.equals("Ясно") || precipitation.equals("ясно") || precipitation.equals("Облачно") || precipitation.equals("облачно")) {
                    System.out.println("Ветер? (есть/нет): ");
                    String wind = input.nextLine();
                    if (wind.equals("Нет") || wind.equals("нет")) {
                        System.out.println("Влажность? (высокая/низкая): ");
                        String humidity = input.nextLine();
                        if (humidity.equals("Низкая") || humidity.equals("низкая")) {
                            System.out.println("Да :)");
                            System.exit(0);
                        }
                    }
                }

            }

        }
        System.out.println("Нет :( ");
    }
}
