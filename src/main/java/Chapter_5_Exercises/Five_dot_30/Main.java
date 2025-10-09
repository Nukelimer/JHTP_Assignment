package Chapter_5_Exercises.Five_dot_30;

public class Main {


    public static void main(String[] args) {
        /*(Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
and VT for Vermont. In AutoPolicy method setState, use the logical OR (||) operator
(Section 5.9) to create a compound condition in an if...else statement that compares the method’s
argument with each two-letter code. If the code is incorrect, the else part of the if...else statement
should display an error message. In later chapters, you’ll learn how to use exception handling to in-
dicate that a method received an invalid argument.*/
    ModifiedAutoPolicy autoPolicy = new ModifiedAutoPolicy(11111, "Camry", "BY");

autoPolicy.setState("BY");

        System.out.println(    autoPolicy.getState());
    }




}
