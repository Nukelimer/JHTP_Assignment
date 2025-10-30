package Chapter_7_Exercises.Exercises.Seven_dot_21;

import java.util.Scanner;

public class TurtleGraphics {
    private static  final int NORTH = 0;
    private  static final int EAST = 1;
    private static final int SOUTH = 2;
    private static  final int WEST = 3;



    private static  final int SIZE = 20;
/*
(Turtle Graphics) The Logo language made the concept of turtle graphics famous. Imagine
a mechanical turtle that walks around the room under the control of a Java application. The turtle
holds a pen in one of two positions, up or down. While the pen is down, the turtle traces out shapes
as it moves, and while the pen is up, the turtle moves about freely without writing anything. In this
problem, you’ll simulate the operation of the turtle and create a computerized sketchpad.
Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an array that con-
tains them. Keep track of the current position of the turtle at all times and whether the pen is cur-
rently up or down. Assume that the turtle always starts at position (0, 0) of the floor with its pen
up. The set of turtle commands your application must process are shown in Fig. 7.29.

CommandMeaning
1Pen up
Pen down
Turn right
Turn left
Move forward 10 spaces (replace 10 for a different number of spaces)
Display the 20-by-20 array
End of data (sentinel)
2
3
4
5,10
6
9

Suppose that the turtle is somewhere near the center of the floor. The following “program”
would draw and display a 12-by-12 square, leaving the pen in the up position:
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9
As the turtle moves with the pen down, set the appropriate elements of array floor to 1s. When the
6 command (display the array) is given, wherever there’s a 1 in the array, display an asterisk or any
character you choose. Wherever there’s a 0, display a blank.
Write an application to implement the turtle graphics capabilities discussed here. Write several
turtle graphics programs to draw interesting shapes. Add other commands to increase the power of
your turtle graphics language.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] floor = new int[SIZE][SIZE];

        int row = 0;
        int column = 0;

        boolean penDown = false;
        int direction = EAST;

        boolean end = false;


        System.out.println("Turtle Graphics Simulation");
        System.out.println("----------------------------");
        System.out.println("Commands:");
        System.out.println("1 - Pen up");
        System.out.println("2 - Pen down");
        System.out.println("3 - Turn right");
        System.out.println("4 - Turn left");
        System.out.println("5 - Move forward (followed by number of steps)");
        System.out.println("6 - Display floor");
        System.out.println("9 - End program\n");


        while (!end){
            System.out.print("Enter command: ");
            int userSelectedOption = scanner.nextInt();

            switch (userSelectedOption){
                case 1:
                    penDown = false;
                    System.out.println("Pen lifted (Pen up)");
                    break;
                case 2:
                    penDown = true;
                    floor[row][column] = 1;
                    System.out.println("Pen lowered (pen down).");
                    break;
                case 3:
                    direction = (direction + 1)% 4;
                    System.out.println("Turned right.");
                    break;
                case 4:
                    direction = (direction + 3)% 4;
                    System.out.println("Turned left.");
                    break;
                case 5:
                    System.out.print("Enter number of steps to move forward: ");
                    int steps = scanner.nextInt();

                    for (int i = 0; i < steps; i++) {
                        int nextRow = row;
                        int nextCol = column;

                        if (direction == NORTH){
                            nextRow--;
                        } else if (direction == EAST) {
                            nextCol++;
                        } else if (direction == SOUTH) {
                            nextRow++;
                        } else if (direction == WEST) {
                            nextCol--;
                        }

                        if (nextRow < 0 || nextRow >= SIZE || nextCol < 0 || nextCol >= SIZE){
                            System.out.println("Reached the edge of the floor. Stopping move.");
                            break;
                        }

                        row = nextRow;
                        column = nextCol;

                        if (penDown){
                            floor[row][column] = 1;
                        }

                    }

                    System.out.println("Moved " + steps + " step(s).");
                    break;
                case 6:
                    System.out.println("\nTurtle Drawing:");

                    for (int r = 0; r < SIZE; r++) {
                        for (int c = 0; c < SIZE; c++) {
                            if (floor[r][c] == 1){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                        System.out.println();
                    }

                    System.out.println();
                    break;

                case 9:
                   end = true;
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid command! Please try again.");
                    break;


            }



        }

    }


}
