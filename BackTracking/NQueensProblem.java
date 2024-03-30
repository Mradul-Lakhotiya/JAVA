import java.util.Scanner;

public class NQueensProblem {
    static int N;
    static int count = 0;

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

    public static void nQueens(char[][] board, int row) {
        if (row == N) {
            printBoard(board);
            count++;
        }

        for (int j = 0; j < N; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.';
            }
        }
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
        System.out.print("Enter the number of Queens : ");
        N = sc.nextInt();

        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.'; 
            }
        }

        nQueens(board, 0);
        System.out.println(count);

        sc.close();
    }
}