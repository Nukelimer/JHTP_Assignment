package Chapter_5_Exercises.Five_dot_22;

public class ModTrianglePrinting {

    public static void main(String[] args) {

        String question = "(Modified Triangle-Printing Program) Modify Exercise 5.15 to combine your code from\n" +
                "the four separate triangles of asterisks such that all four patterns print side by side. [Hint: Make clev-\n" +
                "er use of nested for loops.]";

        for (int outer = 1; outer <= 10; outer++){

            for (int j = 1; j <= outer; j++) {
                System.out.print("*");
            }

            System.out.print("     ");

            for (int j = outer ; j <= 10; ++j) {
                System.out.print("*");
            }

            System.out.print("    ");

            for (int space = 1; space < outer; ++space) {
                System.out.print(" ");
            }
            for (int j = outer; j <= 10; ++j) {
                System.out.print("*");
            }
            System.out.print("    ");

            for (int space = outer; space < 10; ++space) {
                System.out.print(" ");
            }
            for (int j = 1; j <= outer; ++j) {
                System.out.print("*");
            }


            System.out.println();
        }
        }

}
