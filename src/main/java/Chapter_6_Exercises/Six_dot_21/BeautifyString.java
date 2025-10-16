package Chapter_6_Exercises.Six_dot_21;

import java.util.Scanner;

public class BeautifyString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: " );
        String sentence = scanner.nextLine().trim();

        System.out.println(fullStopChecker(sentence));
        System.out.println( capitalisedChecker(sentence));
        System.out.println(  beautifyString(sentence));

    }

    private static String fullStopChecker (String text){
        String lastChar = String.valueOf(text.charAt(text.length()-1));
        if (!lastChar.endsWith(".")){
           text += ".";

        }
           return text;
    }

    private static String capitalisedChecker (String text){
        char firstChar = text.charAt(0);
        if (!Character.isUpperCase(firstChar)){
            text =  Character.toUpperCase(firstChar) + text.substring(1);
        }

       return text;
    }



    public static String beautifyString(String text) {
        String capitalisedText = capitalisedChecker(text);
        return  fullStopChecker(capitalisedText);
    }
}
