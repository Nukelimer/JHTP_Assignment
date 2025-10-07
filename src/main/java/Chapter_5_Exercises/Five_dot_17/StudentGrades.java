package Chapter_5_Exercises.Five_dot_17;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {



        /*(Student Grades) A group of five students earned the following grades: Student 1, ‘A’; stu-
dent 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.*/



        Scanner scanner = new Scanner(System.in);

        String student1name = "",
                student2name = "",
                student3name = "",
                student4name ="",
                student5name = "";

        int A = 0, B = 0, C = 0;

        char student1grade = ' ';
        char student2grade = ' ';
        char student3grade = ' ';
        char student4grade = ' ';
        char student5grade = ' ';

        int count = 1;
        while (count <= 5){
            System.out.print("Student " + count + ""+ " name: ");
            String userEnteredValue = scanner.nextLine();

            if (count == 1){
                student1name = userEnteredValue;
            } else if (count == 2) {
                student2name = userEnteredValue;
            } else if (count == 3) {
                student3name = userEnteredValue;
            } else if (count == 4) {
                student4name = userEnteredValue;
            } else {
                student5name = userEnteredValue;

            }

            System.out.print("Student" + count + " single letter"+ " grade, i.e A: ");
           char userEnteredGradeValue = scanner.next().charAt(0);
           scanner.nextLine();

            if (count == 1){
                student1grade = userEnteredGradeValue;
            } else if (count == 2) {
                student2grade = userEnteredGradeValue;
            } else if (count == 3) {
                student3grade = userEnteredGradeValue;
            } else if (count == 4) {
                student4grade = userEnteredGradeValue;
            } else {
                student5grade = userEnteredGradeValue;

            }



            switch (userEnteredGradeValue){
                case 'A':
                case 'a':
                    A++;
                    break;
                case 'B':
                case 'b':
                    B++;
                    break;
                case 'C':
                case 'c':
                    C++;

                    break;
                default:
                    System.out.println("Invalid grade");
                    count--;


            }





            count++;

        }

        System.out.println(" Student 1 "+ student1name + " " + student1grade  );
        System.out.println(" Student 2 "+ student2name +  " " + student2grade  );
        System.out.println(" Student 3 "+ student3name + " " + student3grade  );
        System.out.println(" Student 4 "+ student4name + " " + student4grade  );
        System.out.println(" Student 5 "+ student5name +  " " + student5grade  );
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("TOTAL FOR A: " + A);
        System.out.println("TOTAL FOR B: " + B);
        System.out.println("TOTAL FOR C: " + C);


    }
}
