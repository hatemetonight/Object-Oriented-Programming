package week5.task1.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите list:");
        String s = inputScanner.nextLine();
        System.out.println(perms(convertListStringToIntegerList(convertStringToList(s))));

    }
    private static List<String> convertStringToList(String s) {
        try {
            return Arrays.asList(s.substring(1, s.length() - 1).split(", "));
        } catch (NumberFormatException e) {
            return Arrays.asList(s.substring(1, s.length() - 1).split(","));
        }

    }
    private static List<Integer> convertListStringToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for(String s : stringList) intList.add(Integer.valueOf(s));
        return  intList;
    }
    public static <E> List<List<E>> perms(List<E> original) {
        if (original.isEmpty()) {
            List<List<E>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        E firstElement = original.remove(0);
        List<List<E>> returnValue = new ArrayList<>();
        List<List<E>> permutations = perms(original);
        for (List<E> smallerPermutated : permutations) {
            for (int index = 0; index <= smallerPermutated.size(); index++) {
                List<E> temp = new ArrayList<>(smallerPermutated);
                temp.add(index, firstElement);
                returnValue.add(temp);
            }
        }
        return returnValue;
    }
}
