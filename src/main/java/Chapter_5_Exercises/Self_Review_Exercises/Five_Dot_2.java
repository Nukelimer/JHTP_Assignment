package Chapter_5_Exercises.Self_Review_Exercises;

public class Five_Dot_2 {

    public static void main(String[] args) {


        String s = "State whether each of the following is true or false. If false, explain why: " +
                "" +
                "a) The default case is required in the switch selection statement.[FALSE, because the default is just for fallback in cases where no case matched the condition specified]." +
                "b) The break statement is required in the last case of a switch selection statement.[TRUE, without the break, if the default is present or found, the statement inside of it will also be executed]." +
                "c) The expression ((x > y) && (a < b)) is true if either x > y is true or a < b is true.[TRUE, both conditions has to be met because and checks for BOTH, right and left must be true]" +
                "d) An expression containing the || operator is true if either or both of its operands are true.[TRUE, one part need to be true because EITHER right side OR left side need to be true]" +
                "e) The comma (,) formatting flag in a format specifier (e.g., %,20.2f) indicates that a value should be output with a grouping separator.[TRUE, it is for formatting purposes to make the number readable based on the locale of the user system setting in terms of region]." +
                "f) To test for a range of values in a switch statement, use a hyphen (–) between the start\n" +
                "and end values of the range in a case label. [FALSE, switch statements only take in String, int,byte, short - in essence small integral value. so it does not accept range values. however, the closest is multiple cases together.]" +
                "g) Listing cases consecutively with no statements between them enables the cases to per-\n" +
                "form the same set of statements.[TRUE, because it goes through them line by line checking to see if any of them matches the condition if yes, it runs the statement.]" +
                "";



    }


}
