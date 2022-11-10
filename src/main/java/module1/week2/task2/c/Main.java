package module1.week2.task2.c;
import java.util.Scanner;

public class Main
{
    public static void eratosthenes(int n)
    {
        int[] a = new int[n + 1];

        for (int i = 0; i <= n; i++) {      // инициализировать все числа как простые
            a[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (a[i] == 1)                  // проверяет, является ли `i` простым числом
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;           // числа, кратные `i`, не являются простыми
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (a[i] == 1) {
                System.out.print(i + " ");  // печатает простые числа
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Введите диапазон чисел:");

        Scanner count_scanner = new Scanner(System.in);
        int count = count_scanner.nextInt();

        eratosthenes(count);
    }
}
