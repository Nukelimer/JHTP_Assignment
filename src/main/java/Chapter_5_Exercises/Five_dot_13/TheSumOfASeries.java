package Chapter_5_Exercises.Five_dot_13;

public class TheSumOfASeries {

    public static void main(String[] args) {
String question = "(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 ... n, where\n" +
        "n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the\n" +
        "corresponding sum. If this were a product instead of a sum, what difficulty might you encounter\n" +
        "with the variable that accumulates the product?";

        long sum = 0;

        long range = 1;


        System.out.printf("%s \t %s \n", "Number", "Sum" );
        while (range <= 100){
          sum += range;
            System.out.printf("%3d  \t %,3d  \n", range, sum);

            range++;

        }


        question = "f this were a product instead of a sum, what difficulty might you encounter\n" +
                "with the variable that accumulates the product?";

        String answer = "the number goes beyond the limit of what LONG can store so eventually it becomes 0.";


    }
}
