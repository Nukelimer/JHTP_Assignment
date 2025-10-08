package Chapter_5_Exercises.Five_dot_20;

public class Leibniz_π_Program {
    public static void main(String[] args) {

        int count = 1;
        double pi = 0.0;
        double denominator = 1.0;
        boolean found = false;
        int terms = 200_000;


        while (count <= terms){
         if (count % 2 == 1)  {
             pi = pi + 4.0 / denominator;
         } else {

             pi = pi - 4.0 / denominator;

         }

         denominator = denominator + 2.0;


             System.out.printf("%-10d%-15.10f%n", count, pi);
//         if (count % 10_000 == 0 || count <= 999){
//         }


            if (!found && Math.floor(pi * 100000) == 314159) {
                System.out.printf("%nFirst time π approximation begins with 3.14159 is at term: %d%n", count);
                found = true;
            }


            count++;


        }

        System.out.printf("%nAfter %,d terms, π ≈ %.12f%n", terms , pi);


    }
}
