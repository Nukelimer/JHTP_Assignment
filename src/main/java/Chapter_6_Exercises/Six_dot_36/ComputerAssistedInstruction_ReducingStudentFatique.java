
package Chapter_6_Exercises.Six_dot_36;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_ReducingStudentFatique {
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
        Random random  = new Random();



        while (true){
            System.out.printf("How much is %d times %d? %n ", firstNum, secondNum);
            int studentInput = scanner.nextInt();

            isAnswerCorrect = studentInput == (firstNum * secondNum);

                int randomResponseMsg = random.nextInt(4) + 1;

            if (isAnswerCorrect){
                switch (randomResponseMsg){
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice Work");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                IsAnswerCorrect();
                break;
            } else {
                switch (randomResponseMsg){


                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }

            }
        }
    }

    public static void IsAnswerCorrect() {
        if (isAnswerCorrect){
            generateQuestion();
        }
    }
}
