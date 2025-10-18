package Chapter_6_Exercises.Six_dot_34;

public class TableOfBinaryOctalAndHexadecimalNumbers {

/*(Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.*/
    public static void main(String[] args) {

        System.out.printf("%-10s %-15s %-10s %-15s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("----------------------------------------------------------");

        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();

            System.out.printf("%-10d %-15s %-10s %-15s%n", i, binary, octal, hex);
        }
    }

}
