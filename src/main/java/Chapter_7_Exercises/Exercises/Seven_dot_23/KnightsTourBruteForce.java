package Chapter_7_Exercises.Exercises.Seven_dot_23;
import java.util.Random;

public class KnightsTourBruteForce {

    private static final int SIZE = 8;
    private static final int TOURS = 1000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] tourLengths = new int[65]; // store count of tours of each length

        int bestTour = 0;

        for (int i = 0; i < TOURS; i++) {
            int moves = performRandomTour();
            tourLengths[moves]++;
            if (moves > bestTour){
                bestTour = moves;

            }
        }

        // print results
        System.out.println("Results after " + TOURS + " random tours:\n");
        System.out.printf("%-10s%-10s%n", "Length", "Count");
        System.out.println("-------------------");

        for (int i = 1; i < tourLengths.length; i++) {
            if (tourLengths[i] > 0) {
                System.out.printf("%-10d%-10d%n", i, tourLengths[i]);
            }
        }

        System.out.println("\nBest tour length: " + bestTour);
    }

    // Simulates one random knight tour
    private static int performRandomTour() {
        int[][] board = new int[SIZE][SIZE];
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};

        int currentRow = 0;     // starting position (0,0)
        int currentCol = 0;
        int moveCount = 1;
        board[currentRow][currentCol] = moveCount;

        boolean movePossible = true;

        while (movePossible) {
            int[] validMoves = new int[8];
            int validCount = 0;

            // check all 8 moves
            for (int move = 0; move < 8; move++) {
                int nextRow = currentRow + vertical[move];
                int nextCol = currentCol + horizontal[move];
                if (isValidMove(nextRow, nextCol, board)) {
                    validMoves[validCount++] = move;
                }
            }

            // no valid moves left → stop
            if (validCount == 0) {
                movePossible = false;
            } else {
                // pick random valid move
                int chosen = validMoves[random.nextInt(validCount)];
                currentRow += vertical[chosen];
                currentCol += horizontal[chosen];
                moveCount++;
                board[currentRow][currentCol] = moveCount;
            }
        }

        return moveCount; // how far the knight got
    }

    // helper to check valid move
    private static boolean isValidMove(int row, int col, int[][] board) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == 0;
    }
}
