package Chapter_5_Exercises.Five_dot_9;

public class Five_dot_9 {
    public static void main(String[] args) {
        String question = "Find and correct the error(s) in each of the following segments of code:";

//        a) while (i = 1; i <= 10, i+)
//        System.out.println(i);

//       1. the usage of the "while" keyword as opposed to the "for" to start the loop.
//       2. the usage of  comma at the end of the condition segment.
//       3. the increment is not done properly, it is not incrementing but just i+ which breaks the code,

//        for (int i = 1; i <= 10; i++)
//        System.out.println(i);







//        b) The following code should print whether an integer value is negative or zero:
//        switch (value) {
//            Case value < 0:
//            System.out.println("Negative");
//            case 0:
//                System.out.println("Zero");
//        }

//        This code cannot work because switch cannot take conditional statements in its case we can we use if.

//        int val = 11;
//
//
//        if (val < 0){
//            System.out.println("Negative.");
//        } else if(val == 0){
//            System.out.println("Zero.");
//        } else {
//
//            System.out.println("None");
//        }





//        c) The following code should output the odd integers from 19 to 1:
//        for (int i = 19; i > 1; i =+ 1)
//            System.out.println(i);


//             for (int i = 19; i >= 1; i--){
//
//                 if (i % 2 != 0){
//                     System.out.println(i);
//                 }
//
//             }









//        d) The following code should output the even integers from 1 to 50:
         int counter = 1;
        do {
           if (counter % 2 == 0){
               System.out.println(counter);
           }
            ++counter;
        } while (counter <= 50);












    }
}
