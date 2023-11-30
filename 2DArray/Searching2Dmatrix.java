import java.util.Scanner;

public class Searching2Dmatrix {
    public static int[] SearchMatri(int[][] matrix, int key) {
        int[] cord = new int[2];
        int i = 0, j = matrix[0].length- 1;
        while (i != matrix.length && j != -1) {
            if (key > matrix[i][j]) {
                i++;
            }
            else if (key < matrix[i][j]) {
                j--;
            }
            else if (key == matrix) {
                return (i, j);
            }
        }
        return cord;
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
    }
}
