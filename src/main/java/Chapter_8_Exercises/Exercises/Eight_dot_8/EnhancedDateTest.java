package Chapter_8_Exercises.Exercises.Eight_dot_8;
/*(Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error checking on the ini-
tializer values for variables month, day and year (currently it validates only the month and day). Pro-
vide a method nextDay to increment the day by one. Write a program that tests method nextDay in
a loop that prints the date during each iteration to illustrate that the method works correctly. Test
the following cases:
a) incrementing into the next month and
b) incrementing into the next year.*/
public class EnhancedDateTest {

    public static void main(String[] args) {
        EnhancedDate date = new EnhancedDate(12, 11, 2002);

        for (int i = 1; i <= 22625; i++) {
            date.nextDay();

            System.out.println(

           date.toString()

            );
        }
    }
}
