package Chapter_4_Exercises.Playground;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int total = 0;
//        int counter =1;
//
//
//        while (counter <= 10){
//            System.out.println("Hello, enter the next grade: ");
//            int grade = scanner.nextInt();
//
//            total = total + grade;
//            counter = counter + 1;
//
//        }
//
//            int average = total / 10;
//            System.out.printf("%n Total of all  10 grades is %d%n", total);
//            System.out.printf("The average is %d%n", average);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int total = 0;
//        int gradeCounter = 0;
//
//        System.out.print("Enter grade or -1 to quit: ");
//        int grade = input.nextInt();
//
//
//        while(grade != -1){
//            total = total + grade;
//            gradeCounter = gradeCounter + 1;
//
//            System.out.print("Enter grade or -1 to quit: ");
//            grade = input.nextInt();
//
//        }
//
//        if (gradeCounter != 0) {
//
//            double average = (double) total / gradeCounter;
//
//            System.out.printf("%nTotal of the %d grades entered is %d%n",
//                    gradeCounter, total);
//            System.out.printf("Class average is %.2f%n", average);
//        }
//        else { // no grades were entered, so output appropriate message
//            System.out.println("No grades were entered");
//        }
//
//    }

//    public static void main(String[] args) {
//        int passes = 0;
//        int fails = 0;
//        int studentCounter = 0;
//
//
//            Scanner scanner = new Scanner(System.in);
//
//
//        while (studentCounter <= 10 ){
//            System.out.print("Enter student result either 1 or 2: ");
//            int result = scanner.nextInt();
//
//            if (result == 1){
//                passes = passes + 1;
//                studentCounter = studentCounter + 1;
//
//            } else if(result == 2) {
//                fails = fails + 1;
//                studentCounter = studentCounter + 1;
//
//            } else {
//                System.out.println("Invalid input");
//            }
//
//
//            System.out.println(studentCounter);
//
//        }
//
//
//        System.out.println("Passes: " + passes);
//        System.out.println("Fails: " + fails);
//
//        if (passes>8){
//            System.out.println("Bonus to instructor!");
//        }}

//    public static void main(String[] args) {
//
//        double x = (double) 2.0;
//        while (true){
//            x *= 100009999999999999000000000090000000099999d;
//            if (x >= 22222222223333333333333333333333333333333333333333d){
//                break;
//            }
//            System.out.println(x);
//
//        }
//
//
//
//
//
//
//
//        int bagsOfRice = 5;           // You have 5 bags
//        int report = ++bagsOfRice;
//
//
//
//
//        System.out.println(bagsOfRice);
//        System.out.println();
//        System.out.println(report);
//
//
//    }
//
//}



    public static void main(String[] args) {
       int x =5;
       int y = 7;

        if (y == 8){
            if (x == 5)
                System.out.println("@@@@@");
        }else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
    }
    }