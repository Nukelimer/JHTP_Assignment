package Chapter_5_Exercises.Five_dot_18;

public class Mod_Compound_Interest_Program {

    public static void main(String[] args) {
      int rate = 5;
        int principal = 1000 * 100;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");



        for (int year = 1; year <= 10; ++year) {

            principal = principal * (100 + rate) / 100;

            int dollars = principal / 100;
            int cents = principal % 100;

            System.out.printf("%2d%18d.%02d%n", year, dollars, cents);
            System.out.println(principal);
        }
    }
}
