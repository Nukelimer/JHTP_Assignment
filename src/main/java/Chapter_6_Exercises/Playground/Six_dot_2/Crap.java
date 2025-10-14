package Chapter_6_Exercises.Playground.Six_dot_2;

import java.security.SecureRandom;

public class Crap {


    private  static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private enum  Status {RUNNING, WON, LOST};

    private  static  final  int SNAKE_EYES = 2;
    private  static  final  int TREY = 3;
    private  static  final  int SEVEN = 7;
    private  static  final  int YO_LEVEN =11;
    private  static  final  int BOX_CARS =12;



    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;


        int sumDice = rollDice();


        switch (sumDice){
            case SEVEN, YO_LEVEN ->
                gameStatus = Status.WON;
            case SNAKE_EYES, BOX_CARS , TREY ->
                gameStatus = Status.LOST;
            default->{
                gameStatus = Status.RUNNING;
                myPoint = sumDice;
                System.out.printf("Point is %d%n", myPoint);


            }

        }
            while (gameStatus == Status.RUNNING){
                sumDice = rollDice();

                if (sumDice == myPoint){
                    gameStatus = Status.WON;

                } else {
                    if (sumDice == SEVEN){
                        gameStatus = Status.LOST;
                    }
                }
            }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        }
        else {
            System.out.println("Player loses");
        }

    }


    public  static  int rollDice(){

        int die1 = 1 + SECURE_RANDOM.nextInt(6);
        int die2 = 1 + SECURE_RANDOM.nextInt(6);

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, (die1 + die2));



        return  die1 + die2;
    }
}
