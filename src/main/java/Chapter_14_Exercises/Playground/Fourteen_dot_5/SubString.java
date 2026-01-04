package Chapter_14_Exercises.Playground.Fourteen_dot_5;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
// test substring methods
        System.out.printf("Substring from index 20 to end is \"%s\"%n",
                letters.substring(20));
        System.out.printf("%s \"%s\"%n",
                "Substring from index 3 up to, but not including, 6 is",
                letters.substring(3, 3));


        String s1 = "hello";
        String s2 = "GOODBYE";

        System.out.println(String.valueOf(s1));

    }
}