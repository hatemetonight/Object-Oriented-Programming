package week2.task3.a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int length = input.nextInt(); // Читаем с клавиатуры размер массива

        double array[] = new double[length]; // Создаём массив double
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        double max_number = 0.0; // Ищем максимальное число
        for (int i = 0; i < length; i++) {
            if (max_number < array[i])
                    max_number = array[i];
        }
        int count_max = 0; // Счетчик максимальных значений
        for (int i = 0; i < length; i++)
        {
            if (max_number == array[i])
            {
                count_max++;
            }
        }
        System.out.printf("Максимальное число = %s \n", max_number);
        System.out.printf("Количество чисел, равных максимальному: %s", count_max);

    }
}
