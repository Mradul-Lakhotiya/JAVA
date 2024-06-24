public class Suduko {
    public static boolean isSafe (int row, int col, int digit, int[][] sudoku) {
        // col 
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        //in box
        int sr = ((int)(row/3)) * 3;
        int sc = ((int)(col/3)) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static boolean sudokuSolver(int row, int col, int[][] sudoku) {
        if (row == 8 && col == 8) {
            return true;
        }
        else if (row == 9) {
            return false;
        }

        int nextCol = col + 1;
        int nextRow = row;
        if (col + 1 == 9) { 
            nextCol = 0;
            nextRow = row + 1;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(nextRow, nextCol, sudoku);
        }
        for (int digit = 1; digit <= 9; digit++) {

            if (isSafe(row, col, digit, sudoku)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(nextRow, nextCol, sudoku)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(0, 0, sudoku)) {
            System.out.println("Solution Exist");
            printSudoku(sudoku);
        }
        else {
            System.out.println("Solution Does not Exist");
            printSudoku(sudoku);
        }
    }
}
