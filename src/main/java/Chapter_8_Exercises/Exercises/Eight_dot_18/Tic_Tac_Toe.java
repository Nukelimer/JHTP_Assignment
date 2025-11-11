package Chapter_8_Exercises.Exercises.Eight_dot_18;

import java.util.Scanner;

public class Tic_Tac_Toe {
/*(HugeInteger Class) Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Meth-
od parse should receive a String, extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the fol-
lowing methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
holds between the two HugeInteger objects and returns false if the relationship does not hold. Pro-
vide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
format specifier %b.]*/


    enum Cell { X, O, EMPTY }

    private final Cell[][] board;
    private boolean isXTurn;

    public Tic_Tac_Toe() {
        board = new Cell[3][3];
        isXTurn = true; // X starts first
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = Cell.EMPTY;
            }
        }
    }


private void displayBoard() {
    System.out.println("\nCurrent Board:");
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            switch (board[row][col]) {
                case X -> System.out.print(" X ");
                case O -> System.out.print(" O ");
                case EMPTY -> System.out.print(" - ");
            }
        }
        System.out.println();
    }
}

private boolean makeMove(int row, int col) {
    // Check if move is valid (inside range and cell is empty)
    if (row < 0 || row >= 3 || col < 0 || col >= 3) {
        System.out.println("Invalid position! Choose between 0 and 2.");
        return false;
    }
    if (board[row][col] != Cell.EMPTY) {
        System.out.println("That cell is already occupied!");
        return false;
    }

    // Place X or O depending on whose turn it is
    board[row][col] = isXTurn ? Cell.X : Cell.O;
    return true;
}
private boolean checkWinner(Cell player) {
    // Check rows
    for (int row = 0; row < 3; row++) {
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player)
            return true;
    }

    // Check columns
    for (int col = 0; col < 3; col++) {
        if (board[0][col] == player && board[1][col] == player && board[2][col] == player)
            return true;
    }

    // Check diagonals
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        return true;

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        return true;

    // No win found
    return false;
}

// Step 8: Check if the game is a draw (no EMPTY cells left)
private boolean isDraw() {
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            if (board[row][col] == Cell.EMPTY) {
                return false;
            }
        }
    }
    return true;
}

// Step 9: Main game loop
public void playGame() {
    Scanner input = new Scanner(System.in);
    boolean gameOver = false;

    System.out.println("Welcome to Tic-Tac-Toe!");
    displayBoard();

    while (!gameOver) {
        // Show which player’s turn
        System.out.printf("%nPlayer %s, enter your move (row and column 0–2): ",
                (isXTurn ? "X" : "O"));
        int row = input.nextInt();
        int col = input.nextInt();

        // Try to make the move
        if (!makeMove(row, col)) {
            // Invalid move, retry same player
            continue;
        }

        // Display updated board
        displayBoard();

        // Check for a win
        if (checkWinner(isXTurn ? Cell.X : Cell.O)) {
            System.out.printf("%nPlayer %s wins! 🎉%n", (isXTurn ? "X" : "O"));
            gameOver = true;
        }
        // Check for a draw
        else if (isDraw()) {
            System.out.println("\nIt’s a draw! 🤝");
            gameOver = true;
        } else {
            // Switch turns
            isXTurn = !isXTurn;
        }
    }

    input.close();
    System.out.println("Game over. Thanks for playing!");
}

// Step 10: Main method to run the game
public static void main(String[] args) {
    Tic_Tac_Toe game = new Tic_Tac_Toe();
    game.playGame();
}


}