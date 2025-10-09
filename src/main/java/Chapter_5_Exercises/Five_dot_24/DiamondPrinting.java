package Chapter_5_Exercises.Five_dot_24;

public class DiamondPrinting {
    public static void main(String[] args) {



        int numberOfRows = 5;
        for (int row = 1; row <= numberOfRows; row++){

            for (int space = row; space < numberOfRows; space++){
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++){
                System.out.print("*");
            }

            System.out.println();
        }


        for (int row = numberOfRows -1; row >=1; row--){
            for (int space = numberOfRows; space> row; space--){
                System.out.print(" ");
            }

            for (int star = 1; star <=(2 * row - 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
