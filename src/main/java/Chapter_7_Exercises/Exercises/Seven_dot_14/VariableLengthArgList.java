package Chapter_7_Exercises.Exercises.Seven_dot_14;

public class VariableLengthArgList {

    public static void main(String[] args) {
/*(Variable-Length Argument List) Write an application that calculates the average of a series
of integers that are passed to method average using a variable-length argument list. Test your method
with several calls, each with a different number of arguments.*/



        System.out.println(average( 33.2,56,23,98,100, 88, 23));
        System.out.println(average( 33, 100, 643.99, 23));




    }

    public static double average (double...list) {

        double sum = 0;

        for (double num: list){
            sum += num;
        }

        return sum/list.length;

    }
}
