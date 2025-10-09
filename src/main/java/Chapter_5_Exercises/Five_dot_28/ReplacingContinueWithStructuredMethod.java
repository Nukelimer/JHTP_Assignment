package Chapter_5_Exercises.Five_dot_28;

public class ReplacingContinueWithStructuredMethod {
    public static void main(String[] args) {


        /*Describe in general how you’d remove any continue statement from a loop in a program
and replace it with some structured equivalent. Use the technique you develop here to remove the
continue statement from the program in Fig. 5.14.*/


                for (int count = 1; count <= 10; count++) { // loop 10 times
//                    if (count == 5) {
////                        count++;
//                    }

                    if (count != 5){
                    System.out.printf("%d ", count);

                    }
                }
                System.out.printf("%nUsed continue to skip printing 5%n");
            }

}
