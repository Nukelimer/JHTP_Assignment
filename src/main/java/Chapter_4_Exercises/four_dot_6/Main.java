package Chapter_4_Exercises.four_dot_6;

public class Main {

    public static void main(String[] args) {
//        //        a) Declare variable sum of type int and initialize it to 0.
//        int sum = 0;
////        b) Declare variable x of type int and initialize it to 1.
//        int x = 1;
////        c) Add variable x to variable sum, and assign the result to variable sum.
//        sum = sum + x;
////        d) Print "The sum is: ", followed by the value of variable sum.
//        System.out.printf("The sum is: %d" , sum );




//        4.6
//        Combine the statements that you wrote in Exercise 4.5 into a Java application that calcu-
//                lates and prints the sum of the integers from 1 to 10. Use a while statement to loop through the
//        calculation and increment statements. The loop should terminate when the value of x becomes 11.


        int sum = 0;
        int x = 1;
        while (x <= 10){
            sum = sum + x;
            x++;
            System.out.println(sum + "____" + x);
        }

        System.out.println(sum);

    }
}
