package Chapter_4_Exercises.four_dot_8;

public class Main {

    public static void main(String[] args) {
//     Identify and correct the errors in each of the following code segments—assume that all vari-
//ables have been properly declared and initialized:

//        while (c <= 5) {
//            product *= c;
//            ++c;
//            System.out.println("Boom");
//
////       THE MISSING CLOSING CURLY BRACE TO CLOSE THE BLOCK OF CODE.
//        }



        int gender = 1;


        if (gender == 1) {
            System.out.println("Woman");
        }
//        ADDING THE SEMICOLON IMMEDIATELY AFTER THE ELSE EYWORD IS A PROBLEM  BECAUSE THIS MEANS THAT THE STATEMENT HAS ENDED BY THE USAGE OF THE SEMICOLON,
//        SO THE BLOCK CONTAINING "Man" WILL ALWAYS RUN.
//        else; {
//            System.out.println("Man");
//        }
        else {
            System.out.println("Man");
        }


    }
}
