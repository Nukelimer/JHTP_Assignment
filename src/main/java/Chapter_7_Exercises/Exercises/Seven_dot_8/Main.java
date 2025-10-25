package Chapter_7_Exercises.Exercises.Seven_dot_8;

import java.util.Arrays;
import java.util.Random;

public class Main {

/*

Write Java statements to accomplish each of the following tasks:
a) Display the value of the tenth element of array r.
b) Initialize each of the six elements of one-dimensional integer array g to -1.
c) Find the maximum of the first one-hundred elements of floating-point array c.
d) Copy a hundred-element array an into a hundred-element array b, but in reverse order.
e) Compute the product of the third to the tenth elements, both inclusive, in a hundred-element integer array w.
*/


    public static void main(String[] args) {

/*
  a) Display the value of the tenth element of array r.
 */
 int[] tenArr ={1,2,3,4,5,12, 6,76,11,8,};
//        System.out.println(tenArr[9]);

        /*
    b) Initialize each of the six elements of one-dimensional integer array g to -1.
        */
        int[] minusOneArr = new int[6];
        Arrays.fill(minusOneArr, -1);

//        for (int i = 0; i < minusOneArr.length; i++) {
//            minusOneArr[i] = -1;
//        }

//        System.out.println(Arrays.toString(minusOneArr));

    /*
    c) Find the maximum of the first one-hundred elements of floating-point array c.
    */

        float[] hundredArr = new float[100];


        Random random = new Random();
        float x = random.nextFloat() * 10000;
//        for (int i = 0; i < hundredArr.length ; i++) {
//            float x = random.nextFloat(10000);
//            hundredArr[i] = x;
//
//        }

        Arrays.fill(hundredArr, x);

        System.out.println(Arrays.toString(hundredArr));
        float largest = hundredArr[3];
        for (int i = 0; i < hundredArr.length; i++) {

            if(hundredArr[i] > largest){
                largest = hundredArr[i];

            }
        }

        for (int i = hundredArr.length; i > 0 ; i--) {

        }

//        System.out.println(largest);



/*
 d) Copy a hundred-element array an into a hundred-element array b, but in reverse order.
 */


        int a[] = {4, 1,2,3};
        int b[] = new  int[4];

        for (int i =  0 ; i < a.length ; i++) {
            b[i] = a[a.length - 1 - i];

        }

//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));


        /*

e) Compute the product of the third to the tenth elements, both inclusive, in a hundred-element integer array w.

 */

        int[] w = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };

        int product = 1;
//
//        for (int i = 2; i <= 9; i++) {
//
//
//                product *= w[i];
//
//        }

        for (int i = 0; i < w.length; i++) {

            if (i > 1 && i <= 9){
                product *= w[i];
                System.out.println(i);
            }
        }

        System.out.println(product);




    }




}
