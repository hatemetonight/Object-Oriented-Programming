package week3.task1.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);
        System.out.println("Введите показания с датчика:");
        String input_sensor = input_scanner.nextLine();

        System.out.println("Как сортировать? (1 - по возрастанию, 2 - по возрастанию средней температуры)");
        int select_sort = input_scanner.nextInt();

        Integer[][] result = Sensor_result(input_sensor);

        if (select_sort == 1) {
            Arrays.sort(result, Comparator.comparingInt(o -> o[0]));
            for (Integer[] integers : result)
                System.out.println(integers[0] + " " +
                        Double.parseDouble(String.valueOf(integers[1])));
        } else if (select_sort == 2) {
            Arrays.sort(result, Comparator.comparingInt(o -> o[1]));
            for (Integer[] integers : result)
                System.out.println(integers[0] + " " +
                        Double.parseDouble(String.valueOf(integers[1])));
        }
        else {
            System.out.println("Такой сортировки нет");
            System.exit(0);
        }
    }

    public static Integer[][] Sensor_result(String input_sensor) {
        String[] data_sensor = input_sensor.split("@");
        Integer[][] result = new Integer[data_sensor.length][2];

        for (int i = 0; i < data_sensor.length; i++){
            result[i][0] = Integer.parseInt(data_sensor[i].substring(0, 2));
            result[i][1] = Integer.parseInt(data_sensor[i].substring(2));
        }
        return result;
    }
}