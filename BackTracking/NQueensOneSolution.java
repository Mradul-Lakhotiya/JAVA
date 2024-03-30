import java.util.Scanner;

public class NQueensOneSolution {
    static int N;

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int j = col - 1, i = row - 1; j >= 0 && i >= 0; j--, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; j < N && i >= 0; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char[][] board, int row) {
        if (row == N) {
            printBoard(board);
        }

        for (int j = 0; j < N; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = '.';
            }
        }

        return false;
    };

    public static void printBoard(char[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.'; 
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Solution Exist");
            printBoard(board);
        }
        else {
            System.out.println("Solution Does not Exist");
        }

        sc.close();
    }
}
