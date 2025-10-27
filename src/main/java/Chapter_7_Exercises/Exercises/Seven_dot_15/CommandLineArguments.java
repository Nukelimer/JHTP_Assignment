package Chapter_7_Exercises.Exercises.Seven_dot_15;

import java.util.Arrays;

public class CommandLineArguments {
    public static void main( String[] args) {
        if (args.length == 0){
            System.out.println("NO ARGUMENTS WAS PASSED!!");
        } else {

            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[0]);


            for (int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) > max){
                    max = Integer.parseInt(args[i]);
                } else if(Integer.parseInt(args[i]) < min) {
                    min = Integer.parseInt(args[i]);
                }
            }

            System.out.println( "Min: " + min);
            System.out.println("Max: " + max);

            double average = (double) (max + min) / 2;
            System.out.println("Average: " + average);



        }

    }
}
