package Chapter_6_Exercises.Six_dot_38;



import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_DifficultyLevels {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isAnswerCorrect;
    private static int entriesCounterCorrect = 0;
    private static int entriesCounterWrong = 0;
    private static int entriesCounter = 0;
       static int firstNum;
       static int secondNum;
       static int studentInput;
    static int difficultLevelPicker;
    public static void main(String[] args) {

/*(Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a com-
puter-assisted instruction program to help teach an elementary school student multiplication.
Modify the program to allow the user to enter a difficulty level. At a difficulty level of 1, the program
should use only single-digit numbers in the problems; at a difficulty level of 2, numbers as large as
two digits, and so on.*/

        System.out.println("""
                (Computer-Assisted Instruction with Difficulty Levels)
                -----------------------------------------------------
                This program will test your multiplication skills!
                You will be asked 10 questions based on your chosen difficulty.
                """);


        setDifficultLevel();
        generateQuestion();
    }
    private static void generateQuestion (){

        Random random  = new Random();

        while (entriesCounter < 10){
//            firstNum = secureRandom.nextInt(10)+ 1;
//            secondNum = secureRandom.nextInt(10) + 1;


            if (difficultLevelPicker == 1){
                firstNum = secureRandom.nextInt(10)+ 1;
                secondNum = secureRandom.nextInt(10) + 1;
            }else{
                firstNum = secureRandom.nextInt(10, 99);
                secondNum = secureRandom.nextInt(10, 99);
            }

            System.out.printf("How much is %d times %d? ", firstNum, secondNum);
            studentInput = scanner.nextInt();

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
    private  static  void setDifficultLevel (){
        System.out.println("What difficult level is? 1 for difficult 1 and 2 for 2.");
        difficultLevelPicker = scanner.nextInt();
        System.out.println();
    }
}
