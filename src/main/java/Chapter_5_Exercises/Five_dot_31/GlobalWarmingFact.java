package Chapter_5_Exercises.Five_dot_31;

import java.util.Scanner;

public class GlobalWarmingFact {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int result = 0;

        for (int number = 1; number <=5; number++){

            switch (number){

                case 1:
                    System.out.println("QUESTION " + number);
                    System.out.println("Which gas is usually considered the main driver of human-induced global warming? ");
                    System.out.println("1) Nitrogen (N₂)");
                    System.out.println("2) Oxygen (O₂)");
                    System.out.println("3) Carbon dioxide (CO₂)");
                    System.out.println("4) Argon (Ar)");
                    break;
                case 2:
                    System.out.println("QUESTION " + number);
                    System.out.println("Which of the following is a common skeptic argument about global warming? ");
                    System.out.println("1) Climate has changed naturally in the past without human input");
                    System.out.println("2) Greenhouse gases trap heat in the atmosphere");
                    System.out.println("3) Global temperature trends show warming over the last century");
                    System.out.println("4) Carbon emissions from fossil fuels have increased rapidly since the Industrial Revolution");
                    break;
                case 3:
                    System.out.println("QUESTION " + number);
                    System.out.println("Which of these impacts are projected by many climate models under continued warming?");
                    System.out.println("1) More frequent heat waves");
                    System.out.println("2) Rising sea levels");
                    System.out.println("3) Increased rainfall extremes");
                    System.out.println("4) All of the above");
                    break;
                case 4:
                    System.out.println("QUESTION " + number);
                    System.out.println("Which year’s global warming consensus is closest to the scientific majority view that human " +
                            "activities are the dominant cause of recent warming?");
                    System.out.println("1) 50% of scientists agree");
                    System.out.println("2) 70% of scientists agree");
                    System.out.println("3) 97% of scientists agree");
                    System.out.println("4) 20% of scientists agree");
                    break;

                case 5:
                    System.out.println("QUESTION " + number);
                    System.out.println("Skeptics sometimes argue that warming is caused by changes in the sun’s output. What is a counterargument supported by mainstream climate science?");
                    System.out.println("1) Solar output has remained largely stable while temperatures rose");
                    System.out.println("2) Sun output changes always lead to cooling");
                    System.out.println("3) Solar cycles are unrelated to Earth’s climate");
                    System.out.println("4) The sun’s influence is negligible by definition");
                    break;
            }

            System.out.println("Enter answer in as number, i.e, 1: \n");
            int userAnswer = scanner.nextInt();
            String x = String.valueOf(userAnswer);
            String  finalAnswer = String.valueOf(x.charAt(0));


            if (finalAnswer.equals("3") && number == 1) {

                result++;
            } else if (finalAnswer.equals("1") && number == 2) {
                result++;
            } else if (finalAnswer.equals("4") && number == 3) {
                result++;
            } else if (finalAnswer.equals("3") && number == 4) {
                result++;
            } else if (finalAnswer.equals("1") && number == 5) {
                result++;
            }


        }

        if (result == 5 ){
            System.out.println("Excellent");
        } else if (result == 4) {
            System.out.println("Very good");
        }else if (result < 4) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }


    }
}
