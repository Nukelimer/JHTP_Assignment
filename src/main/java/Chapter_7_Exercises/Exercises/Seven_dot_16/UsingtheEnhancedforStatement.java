package Chapter_7_Exercises.Exercises.Seven_dot_16;

import java.util.Arrays;

public class UsingtheEnhancedforStatement {
/*(Using the Enhanced for Statement) Write an application that uses an enhanced for
statement to find the absolute values of int numbers passed by command-line arguments.*/
    public static void main(String[] args) {



        if ( args.length == 0){
            System.out.println("ARGS ARE NOT PROVIDED!!!");
            return;
        } {
            for (String arg: args){
                int number = Integer.parseInt(arg);
                if (number < 0){
                    number = -number;

                } else {
                    number = number;
                }
            }
        }
    }
}
