package main.java.module2.week6.task1;


import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class FrequentSymbol {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String s = inputScanner.nextLine().toLowerCase();

        System.out.println(getFrequentSymbol(stringToListOfChars(s)));
    }

    public static List<Character> stringToListOfChars (String s) {
        char[] strToArray = s.replaceAll("'", "").toCharArray();
        List<Character> listChars = new ArrayList<>();
        for (char c : strToArray) {
            listChars.add(c);
        }
        return listChars;
    }

    public static ArrayList<String> getFrequentSymbol(List<Character> listChars) {
        Map< String, Long > wordsByCount =  listChars.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        String prevalentWord = wordsByCount.entrySet()
                .stream().max(Map.Entry.comparingByValue()).get().getKey();

        ArrayList<String> chars = new ArrayList<>();
        chars.add("'" + prevalentWord + "'");
        chars.add(String.valueOf(wordsByCount.get(prevalentWord)));
        return chars;
    }
}
