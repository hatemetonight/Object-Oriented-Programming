package week3.task1.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите показания с датчика:");
        String inputSensor = inputScanner.nextLine();

        System.out.println("Как сортировать? (1 - по возрастанию, 2 - по возрастанию средней температуры)");
        int selectSort = inputScanner.nextInt();

        Integer[][] result = sensorResult(inputSensor);

        if (selectSort == 1) {
            Arrays.sort(result, Comparator.comparingInt(o -> o[0]));
            for (Integer[] integers : result)
                System.out.println(integers[0] + " " +
                        Double.parseDouble(String.valueOf(integers[1])));
        } else if (selectSort == 2) {
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

    public static Integer[][] sensorResult(String inputSensor) {
        String[] dataSensor = inputSensor.split("@");
        Integer[][] result = new Integer[dataSensor.length][2];

        for (int i = 0; i < dataSensor.length; i++){
            result[i][0] = Integer.parseInt(dataSensor[i].substring(0, 2));
            result[i][1] = Integer.parseInt(dataSensor[i].substring(2));
        }
        return result;
    }
}