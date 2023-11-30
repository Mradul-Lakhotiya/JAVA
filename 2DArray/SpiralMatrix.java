import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // printing top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + ", ");
            }
            // printing right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + ", ");
            }
            // printing bottom
            if (startRow < endRow) {  // check if there is a row to print
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + ", ");
                }
            }
            // printing left
            if (startCol < endCol) {  // check if there is a column to print
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + ", ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("(" + i + ", " + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralMatrix(matrix);
    }
}
