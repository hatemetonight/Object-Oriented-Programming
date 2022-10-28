package main.java.module1.week4.task1;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите абсолютный путь до файла:");
        String inputPath = input.nextLine();
        System.out.println(ReadFiles(inputPath));


    }
    public static String ReadFiles (String inputPath) {
        File fileToRead = new File(inputPath);
        StringBuilder stringBuilder = new StringBuilder();
        try( FileReader fileStream = new FileReader( fileToRead );
             BufferedReader bufferedReader = new BufferedReader( fileStream ) ) {

            String line;
            while( (line = bufferedReader.readLine()) != null ) {
                stringBuilder.append(line).append("\n");
            }

        } catch (IOException ex ) {
            throw new RuntimeException(ex);
        }
        return stringBuilder.toString();
    }
}
