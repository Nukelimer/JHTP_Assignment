package Chapter_6_Exercises.Playground;

public class MethodOverload {

    public static void main(String[] args) {
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
        System.out.printf("Square of integer 7 is %d%n", square(7));
    }

    public static double square (double doubleValue){
        System.out.printf("%nCalled square with double argument: %.10f%n",
                doubleValue);
        return  doubleValue * doubleValue;
    }

    public static int square (int doubleValue){
        System.out.printf("%nCalled square with int argument: %d%n",
                doubleValue);

        return  doubleValue * doubleValue;


    }




}
