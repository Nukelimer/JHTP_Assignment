package Chapter_6_Exercises.Six_dot_35;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_Assisted_Instruction {
       private static final SecureRandom secureRandom = new SecureRandom();
       private static final Scanner scanner = new Scanner(System.in);
       private static boolean isAnswerCorrect;
     public static void main(String[] args) {


/*(Computer-Assisted Instruction) The use of computers in education is referred to as com-
puter-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question.
 This method should be called once when the application begins execution and each time the
user answers the question correctly.*/

            generateQuestion();
    }
        private static void generateQuestion (){
            int firstNum = secureRandom.nextInt(10)+ 1;
            int secondNum = secureRandom.nextInt(10) + 1;

            while (true){
                System.out.printf("How much is %d times %d? %n ", firstNum, secondNum);
                int studentInput = scanner.nextInt();

                isAnswerCorrect = studentInput == (firstNum * secondNum);
                System.out.println(studentInput);

                if (isAnswerCorrect){
                    System.out.println("Very good!");
                    IsAnswerCorrect();
                    break;
                } else {

                    System.out.println("No. Please try again.");
                }
            }
        }

    public static void IsAnswerCorrect() {
        if (isAnswerCorrect){
            generateQuestion();
        }
    }
}
