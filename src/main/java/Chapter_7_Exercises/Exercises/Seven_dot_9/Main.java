package Chapter_7_Exercises.Exercises.Seven_dot_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Consider a two-by-three integer array t.
a) Write a statement that declares and creates t.
b) How many rows does t have?
c) How many columns does t have?
d) How many elements does t have?
e) Write access expressions for all the elements in row 1 of t.
f) Write access expressions for all the elements in column 2 of t.
g) Write a single statement that sets the element of t in row 0 and column 1 to zero.
h) Write individual statements to initialize each element of t to zero.
i) Write a nested for statement that initializes each element of t to zero.
j) Write a nested for statement that inputs the values for the elements of t from the user.
k) Write a series of statements that determines and displays the smallest value in t.
l) Write a single printf statement that displays the elements of the first row of t.
m) Write a statement that totals the elements of the third column of t. Do not use iteration.
n) Write a series of statements that displays the contents of t in tabular format. List the
column indices as headings across the top, and list the row indices at the left of each row.*/


//a) Write a statement that declares and creates t.
int[][] t = new int[2][3];
//b) How many rows does t have?--->[2]
// c) How many columns does t have?--->[3]
// d) How many elements does t have?--->[6]
// e) Write access expressions for all the elements in row 1 of t.
    t[1][0]= 0;
    t[1][1] = 0;
    t[1][2] = 0;

//f) Write access expressions for all the elements in column 2 of t.
        t[0][2]= 0;
        t[1][2] = 0;

//g) Write a single statement that sets the element of t in row 0 and column 1 to zero.
        t[0][1] = 0;

//h) Write individual statements to initialize each element of t to zero.
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

//i) Write a nested for statement that initializes each element of t to zero.
        for (int i = 0; i < t.length; i++) {

            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = 0;
            }
        }

        System.out.println(t[1][2]);




//j) Write a nested for statement that inputs the values for the elements of t from the user.
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("Enter value of t  [" + i + "][" + j + "]");

                t[i][j] = input.nextInt();

            }
        }

        for (int i = 0; i < t.length; i++) {

            for (int j = 0; j < t[0].length; j++) {
                System.out.print(" - " + t[i][j]);
            }

            System.out.println();
        }



        //k)  Write a series of statements that determines and displays the smallest value in t.
        int smallest = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < smallest){
                    smallest =  t[i][j];
                }
            }

        }

        System.out.println(smallest);

        for (int i = 0; i < t[0].length; i++) {

        System.out.printf("     %d", t[1][i]);
        }
        System.out.println();

//        m) Write a statement that totals the elements of the third column of t. Do not use iteration.
        System.out.println(t[0][2]+ t[1][2]);
    }



}
