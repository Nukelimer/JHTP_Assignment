package Chapter_7_Exercises.Exercises.Seven_dot_22;


    import java.util.Random;

    public class KnightsTour {


        private static final int SIZE = 8;

        public static void main(String[] args) {
            int[][] board = new int[SIZE][SIZE];
            int[][] accessibility = {
                    {2, 3, 4, 4, 4, 4, 3, 2},
                    {3, 4, 6, 6, 6, 6, 4, 3},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {3, 4, 6, 6, 6, 6, 4, 3},
                    {2, 3, 4, 4, 4, 4, 3, 2}
            };


            int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
            int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};


            int currentRow = 0;
            int currentCol = 0;

            int moveCount = 1;
            board[currentRow][currentCol] = moveCount;

            while (moveCount < SIZE * SIZE) {
                int bestMove = -1;
                int minAccessibility = 99;


                for (int move = 0; move < 8; move++) {
                    int nextRow = currentRow + vertical[move];
                    int nextCol = currentCol + horizontal[move];


                    if (isValidMove(nextRow, nextCol, board)) {

                        if (accessibility[nextRow][nextCol] < minAccessibility) {
                            minAccessibility = accessibility[nextRow][nextCol];
                            bestMove = move;
                        }
                    }
                }


                if (bestMove == -1) break;

                currentRow += vertical[bestMove];
                currentCol += horizontal[bestMove];
                moveCount++;
                board[currentRow][currentCol] = moveCount;


                for (int move = 0; move < 8; move++) {
                    int testRow = currentRow + vertical[move];
                    int testCol = currentCol + horizontal[move];
                    if (isValidMove(testRow, testCol, board)) {
                        accessibility[testRow][testCol]--;
                    }
                }
            }


            printBoard(board, moveCount);
        }

        private static boolean isValidMove(int row, int col, int[][] board) {
            return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == 0;
        }

        private static void printBoard(int[][] board, int moves) {
            System.out.println("Knight completed " + moves + " moves.\n");
            for (int[] rows : board) {
                for (int square : rows) {
                    System.out.printf("%3d ", square);
                }
                System.out.println();
            }
        }


}
