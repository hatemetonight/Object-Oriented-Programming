package module1.week3.task1.b;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text =  inputStr.nextLine();

        System.out.printf("%.2f",shannonEntropy(text));

    }
    private static final double LOG2 = 0.69314718056;

    public static double shannonEntropy(String str) {
        int len = str.length();
        char[] frequency = new char[256];
        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        double entropy = 0;
        for (int i = 0; i < 256; i++) {
            int f = frequency[i];
            if (f == 0) {
                continue;
            }
            double k = (double)f / len;
            entropy += k * Math.log(k) / LOG2;
        }
        return entropy * (-1);
    }


}