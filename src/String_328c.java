import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class String_328c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.split(" ");
        sortByLength(words);
        for (int i = 0; i < words.length; ++i){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1, words[i].length()).toLowerCase();
        }
        return words[0] + " " + words[1] + " " + words[2];
    }

    private static void sortByLength(String[] words) {
        for (int j = 0; j < words.length - 1; j++) {
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }
            }
        }
    }
}