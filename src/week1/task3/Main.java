package week1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длину ребра икосаэдра:");

        Scanner edge = new Scanner(System.in);
        double a = edge.nextDouble();

        double volume = 5.0/12.0  * (3 + Math.sqrt(5)) * Math.pow(a,3);

        System.out.printf("Объем: %s см3", volume);
    }
}