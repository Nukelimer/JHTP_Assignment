package Chapter_5_Exercises.Five_dot_26;

public class ReplacingBreakInLoopWithStructured {

   /*A criticism of the break statement and the continue statement is that each is unstructured.
Actually, these statements can always be replaced by structured statements, although doing so can
be awkward. Describe in general how you’d remove any break statement from a loop in a program
and replace it with some structured equivalent. [Hint: The break statement exits a loop from the
body of the loop. The other way to exit is by failing the loop-continuation test. Consider using in
the loop-continuation test a second test that indicates “early exit because of a ‘break’ condition.”]
Use the technique you develop here to remove the break statement from the application in
Fig. 5.13.*/


        public static void main(String[] args) {
            int count;
            boolean exit = true;
            for (count = 1; count <= 10 && exit; count++) {
                if (count == 5) {
                    exit = false;
                }else {
                System.out.printf("%d ", count);

                }
            }
            System.out.printf("%nBroke out of loop at count = %d%n", count);










        }

}

//****
//****
//****
