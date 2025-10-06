package Chapter_5_Exercises.Self_Review_Exercises;

public class Five_Dot_4 {

    public static void main(String[] args) {

//        Find the error in each of the following code segments, and explain how to correct it:





//        (A)
//       i = 1;  // i type is not declared.
//        while (i <= 10); // the end of the statement using semicolon is wrong, it should be replaced with the missing opening curly braces.
//        ++i; }

//        (B)
//for (k = 0.1; k != 1.0; k += 0.1) {  // k type is not declared, it is a bad practice to use numeric types that are not precise like float or double as it comes with tradeoffs of unexpected number values due to the decimal value feature. in addition, the condition for the for loop to run will always be false as there will be extra numbers after the decimal which automatically make "1.0" to be false and the condition will always be true and continue forever - indefinite loop.
//        System.out.println(k);
//    }


//        switch (n) { // n  is not declared.
//            case 1:
//                System.out.println("The number is 1"); // if case 1 is true, case 1 and 2 runs because of lack of "break" keyword after case 1 statement so case 1 and case 2 statement executes.
//            case 2:
//                System.out.println("The number is 2");
//                break;
//            default:
//                System.out.println("The number is not 1 or 2");
//                break;
//        }


        int n = 1;   // i type is not declared
        while (n <= 10) {
            System.out.println(n);
            ++n;
        }



    }



}
