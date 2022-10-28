package main.java.module1.week4.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сообщение: ");
        String inputMessage = input.nextLine();

        System.out.print("""
                Введите тип данных:\s
                Integer, Float, Double, Character, Byte, Short, Long, Boolean\s
                """);
        String dataType = input.nextLine();

        System.out.printf("%-20s %-20s %-30s %-20s\n", "Ваше сообщение", "Тип", "Преобразованное сообщение", "Тип");
        System.out.printf("%-20s %-20s %-30s %-20s\n", inputMessage,
                inputMessage.getClass().getSimpleName(),
                valueConverter(inputMessage,dataType),
                valueConverter(inputMessage,dataType).getClass().getSimpleName());
    }

    public static Object valueConverter(String input_message, String dataType) {
        switch (dataType) {
            case "Integer" -> {
                try {
                    return Integer.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Float" -> {
                try {
                    return Float.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Double" -> {
                try {
                    return Double.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Character" -> {
                try {
                    return new char[input_message.length()];
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            case "Byte" -> {
                try {
                    return Byte.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Short" -> {
                try {
                    return Short.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Long" -> {
                try {
                    return Long.valueOf(input_message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            case "Boolean" -> {
                try {
                    return Boolean.valueOf(input_message);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            default -> {
                return input_message;
            }
        }
    }
}

