package main.java.module1.week2.task3.c;
import main.java.module1.week2.task3.b.MergeSort;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int length = input.nextInt(); // Читаем с клавиатуры размер массива

        int array[] = new int[length]; // Создаём массив int
        System.out.println("Введите элементы массива:");


        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        int[] result = MergeSort.mergesort(array); // main.java.module1.week2.task3.b - MergeSort

        double median;

        if (result.length % 2 == 0) // Если число четное
            median = ((double)result[result.length/2] + (double)result[result.length/2 - 1])/2;
        else
            median = result[result.length/2];

        System.out.printf("Медиана чисел = %s",median);
    }
}