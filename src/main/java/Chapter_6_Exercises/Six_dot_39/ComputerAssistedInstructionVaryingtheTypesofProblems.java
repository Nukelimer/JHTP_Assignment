package Chapter_6_Exercises.Six_dot_39;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstructionVaryingtheTypesofProblems {




        private static final SecureRandom secureRandom = new SecureRandom();
        private static final Scanner scanner = new Scanner(System.in);

        private static int entriesCounterCorrect = 0;
        private static int entriesCounterWrong = 0;
        private static int entriesCounter = 0;

        private static int difficultLevelPicker;
        private static int mathProblemPicker;

        public static void main(String[] args) {

            System.out.println("""
                (Computer-Assisted Instruction with Difficulty Levels)
                -----------------------------------------------------
                This program will test your multiplication skills!
                You will be asked 10 questions based on your chosen difficulty.
                """);

            setMathType();
            setDifficultLevel();
            generateQuestions();
        }

    private static void setMathType() {
        System.out.print("Enter the Math type of operation option of 1 means addition problems only, \n" +
                " 2 means subtraction problems only, 3 means multiplication problems only,\n" +
                "4 means division problems only and 5 means a random mixture of all these types): ");
        mathProblemPicker = scanner.nextInt();
        System.out.println();
    }

        private static void setDifficultLevel() {
            System.out.print("Enter difficulty level (1 for single-digit, 2 for double-digit): ");
            difficultLevelPicker = scanner.nextInt();
            System.out.println();
        }


        private static void generateQuestions() {
            Random random = new Random();

            while (entriesCounter < 10) {
                int firstNum;
                int secondNum;


                if (difficultLevelPicker == 1) {
                    firstNum = secureRandom.nextInt(10) + 1;   // 1–10
                    secondNum = secureRandom.nextInt(10) + 1;
                } else {
                    firstNum = secureRandom.nextInt(90) + 10;  // 10–99
                    secondNum = secureRandom.nextInt(90) + 10;
                }


                System.out.printf("How much is %d times %d? ", firstNum, secondNum);
                int studentInput = scanner.nextInt();

                boolean isAnswerCorrect = false;

                        if(mathProblemPicker == 1){
                            isAnswerCorrect =(studentInput == (firstNum + secondNum));
                        } else if (mathProblemPicker == 2) {
                            isAnswerCorrect =(studentInput == (firstNum - secondNum));
                        } else if (mathProblemPicker == 3) {
                            isAnswerCorrect =(studentInput == (firstNum * secondNum));
                        } else if (mathProblemPicker == 4) {
                            isAnswerCorrect =(studentInput == (firstNum / secondNum));
                        } else if (mathProblemPicker == 5) {
                            int rnadomMathType = secureRandom.nextInt(4) + 1;

                            switch (rnadomMathType){
                                case 1 ->  isAnswerCorrect =(studentInput == (firstNum + secondNum));
                                case 2 ->  isAnswerCorrect =(studentInput == (firstNum - secondNum));
                                case 3 ->  isAnswerCorrect =(studentInput == (firstNum * secondNum));
                                case 4 ->  isAnswerCorrect =(studentInput == (firstNum / secondNum));

                            }
                        } else {
                            return;
                        }
                entriesCounter++;


                int randomResponseMsg = random.nextInt(4) + 1;

                if (isAnswerCorrect) {
                    entriesCounterCorrect++;
                    switch (randomResponseMsg) {
                        case 1 -> System.out.println("Very good!");
                        case 2 -> System.out.println("Excellent!");
                        case 3 -> System.out.println("Nice work!");
                        case 4 -> System.out.println("Keep up the good work!");
                    }
                } else {
                    entriesCounterWrong++;
                    switch (randomResponseMsg) {
                        case 1 -> System.out.println("No. Please try again.");
                        case 2 -> System.out.println("Wrong. Try once more.");
                        case 3 -> System.out.println("Don't give up!");
                        case 4 -> System.out.println("No. Keep trying.");
                    }
                }

                System.out.println();
            }


            showPerformance();
        }


        private static void showPerformance() {
            double percentageOfCorrectAnswers = (entriesCounterCorrect / (double) entriesCounter) * 100;

            System.out.printf("You answered %d out of %d correctly (%.2f%%).%n",
                    entriesCounterCorrect, entriesCounter, percentageOfCorrectAnswers);

            if (percentageOfCorrectAnswers < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }


            System.out.print("\nDo you want to play again? (1 for YES, 2 for NO): ");
            int playAgain = scanner.nextInt();
            if (playAgain == 1) {
                restart();
            } else {
                System.out.println("Goodbye! Keep practicing.");
            }
        }


        private static void restart() {
            entriesCounter = 0;
            entriesCounterCorrect = 0;
            entriesCounterWrong = 0;

            System.out.println("\nStarting a new round...");
            setDifficultLevel();
            generateQuestions();
        }


}
