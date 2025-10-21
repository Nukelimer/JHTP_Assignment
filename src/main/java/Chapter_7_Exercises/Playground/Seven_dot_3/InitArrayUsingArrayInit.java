package Chapter_7_Exercises.Playground.Seven_dot_3;

public class InitArray {

    public static void main(String[] args) {
        int[] newArray = {1,2,3,4,55,7,9,9,1,4,45,9,5,8,34,65,7};


        System.out.printf("%2s %12s%n", "Index", "Value");

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = i*723;
            System.out.printf("%3d %12s %n", i , newArray[i]);
        }
    }
}
