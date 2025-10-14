package Chapter_6_Exercises.Self_Review_Exercises.Six_dot_4;

public class Main {

    public static void main(String[] args) {
/*Give the method header for each of the following methods:
a) Method hypotenuse, which takes two double-precision, floating-point arguments
side1 and side2 and returns a double-precision, floating-point result.
b) Method smallest, which takes three integers x, y and z and returns an integer.
c) Method instructions, which does not take any arguments and does not return a value.
[Note: Such methods are commonly used to display instructions to a user.]
d) Method intToFloat, which takes integer argument number and returns a float.*/

    }
static double hypotenuse(double side1, double side2) {
        double sum = side1 + side2;
        return sum;

        }
    static int smallest (int x, int y, int z) {
        int num = 4;
        return num;

    }

    static void instructions(){
        System.out.println("Wiggle your waist here.");
    }

    static float intToFloat(int val){
      return (float) val;
    }


}
