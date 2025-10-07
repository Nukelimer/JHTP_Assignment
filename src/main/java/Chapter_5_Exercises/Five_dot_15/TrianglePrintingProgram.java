package Chapter_5_Exercises.Five_dot_15;

public class TrianglePrintingProgram {


    public static void main(String[] args) {

        String question = "(Triangle Printing Program) Write an application that displays the following patterns sep-\n" +
                "arately, one below the other. Use for loops to generate the patterns. All asterisks (*) should be print-\n" +
                "ed by a single statement of the form System.out.print('*'); which causes the asterisks to print side\n" +
                "by side. A statement of the form System.out.println(); can be used to move to the next line. A\n" +
                "statement of the form System.out.print(' '); can be used to display a space for the last two pat-\n" +
                "terns. There should be no other output statements in the program. [Hint: The last two patterns re-\n" +
                "quire that each line begin with an appropriate number of blank spaces.]";

        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 10; i >= 1; i--){

            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println();
        System.out.println();



        for (int i = 1; i <= 10; i++){
            for (int space = 1; space < i; space++){
                System.out.print(" ");
            }
            for (int j = i; j <= 10; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 10; i++){
            for (int j = i; j <= 10; ++j) {
                System.out.print(" ");
            }

            for (int space = 1; space < i; space++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
