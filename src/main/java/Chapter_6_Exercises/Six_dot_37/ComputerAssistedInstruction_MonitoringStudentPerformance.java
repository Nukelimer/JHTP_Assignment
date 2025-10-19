package Chapter_6_Exercises.Six_dot_37;




import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_MonitoringStudentPerformance {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isAnswerCorrect;
    private static int entriesCounterCorrect = 0;
    private static int entriesCounterWrong = 0;
    private static int entriesCounter = 0;
    public static void main(String[] args) {


/*(Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it.*/
        System.out.println("""
                (Computer-Assisted Instruction with Difficulty Levels)
                -----------------------------------------------------
                This program will test your multiplication skills!
                You will be asked 10 questions.
                """);
        generateQuestion();
    }
    private static void generateQuestion (){
        int firstNum = secureRandom.nextInt(10)+ 1;
        int secondNum = secureRandom.nextInt(10) + 1;
        Random random  = new Random();

        while (true){
            System.out.printf("How much is %d times %d? ", firstNum, secondNum);
            int studentInput = scanner.nextInt();

            isAnswerCorrect = studentInput == (firstNum * secondNum);

            int randomResponseMsg = random.nextInt(4) + 1;

            if (isAnswerCorrect){
                entriesCounterCorrect += 1;
            }  else {
                entriesCounterWrong += 1;
            }

            entriesCounter++;

            if (entriesCounter == 10){

                double percentageOfCorrectAnswers = (entriesCounterCorrect / (double) entriesCounter) * 100;
                if (percentageOfCorrectAnswers < 75){
                System.out.println(" Please ask your teacher for extra help.");
                    restart();
                } else {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                    restart();
                }

            }

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

    public static void restart() {
        entriesCounter = 0;
        entriesCounterCorrect = 0;
        entriesCounterWrong = 0;
        generateQuestion();

    }
}
