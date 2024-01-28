package TinkJava.Lion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LionPassword {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текстовую строку:");
        String input = scanner.nextLine();

        String result = hidePasswords(input);
        System.out.println("Вывод: " + result);
    }


    private static String hidePasswords(String text) {
        Pattern pattern = Pattern.compile("code");
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("???");
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текстовую строку:");
        String input = scanner.nextLine();

        String result = hidePasswords(input);
        System.out.println("Вывод: " + result);
    }

    private static String hidePasswords(String text) {
//        char[] chars = text.toCharArray();
//        System.out.println(chars);
        String[] massive = (text + "$").split("code");
        System.out.println(Arrays.toString(massive));
        String result = "";
        for (int i = 0; i < massive.length; i++) {
            result = result + massive[i];
            if (i != massive.length - 1) {
                result = result + "???";
            }
        }
        return result.substring(0, result.length() -1);
    }
}

class PasswordReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine());
            input.append("\n");
        }

        scanner.close();

        Pattern pattern = Pattern.compile("code\\d+");
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll("???");

        System.out.println(result);
    }
}

class ResultLion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine());
            input.append("\n");
        }

        scanner.close();

        Pattern pattern = Pattern.compile("code\\d+");
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll("???");

        System.out.println(result);
    }
}