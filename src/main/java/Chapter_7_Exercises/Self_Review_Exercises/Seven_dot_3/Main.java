package Chapter_7_Exercises.Self_Review_Exercises.Seven_dot_3;

import java.util.Arrays;

public class Main {

/*Perform the following tasks for an array called fractions:
a) Declare a constant ARRAY_SIZE that’s initialized to 10.
[int ARRAY_SIZE = 10;]

b) Declare an array with ARRAY_SIZE elements of type double, and initialize the elements
to 0.
[ double[] Arr = new double[A]]

c) Refer to array element 4.
Arr[3];
d) Assign the value 1.667 to array element 9.
[Arr[8] = 1.667]
e) Assign the value 3.333 to array element 6.
[Arr[5] = 3.333]
f) Sum all the elements of the array, using a for statement. Declare the integer variable x
as a control variable for the loop.
[
double sum = 0;
for(int i = 0; i < Arr.length; i++){
 sum +=Arr[i];
}

]


*/

    public static void main(String[] args) {

        int ARRAY_SIZE = 10;

        double[] Arr = new double[ARRAY_SIZE];

        Arr[8] = 1.667;

        Arr[5] = 3.333;

        System.out.println(Arrays.toString(Arr));

        double sum = 0;
        for(int i = 0; i < Arr.length; i++){

            sum +=Arr[i];
        }

        System.out.println(sum);

    }
}
