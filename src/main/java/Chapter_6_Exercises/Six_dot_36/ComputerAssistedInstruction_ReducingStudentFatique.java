
package Chapter_6_Exercises.Six_dot_36;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_ReducingStudentFatique {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isAnswerCorrect;
    public static void main(String[] args) {


/*(Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environ-
ments is student fatigue. This can be reduced by varying the computer’s responses to hold the student’s attention. Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.*/

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
