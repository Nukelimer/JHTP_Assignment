package Chapter_5_Exercises.Five_dot_27;

public class OutcomeOfLoop {

    public static void main(String[] args) {

        /*

        What does the following program segment do?

        for (i = 1; i <= 5; i++) {
for (j = 1; j <= 3; j++) {
for (k = 1; k <= 4; k++) {
System.out.print('*');
}
System.out.println();
}
System.out.println();
}


       */


        /* IT WILL THROW AN ERROR BECAUSE THE TYPE OF THE INITIALIZATION VARIABLE IS NOT DEFINED. IF IT IS FIXED
        THE RESULT WILL BE 4 * IN X AXIS TIMES 3 IN 5 SECTIONS.*/



        for (int i = 1; i <= 5; i++) {
            for ( int j = 1; j <= 3; j++) {
                for ( int k = 1; k <= 4; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
