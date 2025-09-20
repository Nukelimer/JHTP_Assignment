package Chapter_2_Exercises.two_dot_31;

public class Main {

    public static void main(String[] args) {
       Squares_And_Cubes();
    }


    public static void Squares_And_Cubes() {


        System.out.print("Number: " + "Square: " + " Cube: ");
        System.out.println("  ");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println( i + "\t      " +  (i * i) + " \t   " + (i*i*i));
        }
    }
}
