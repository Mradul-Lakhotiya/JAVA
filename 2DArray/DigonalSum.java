import java.util.Scanner;

public class DigonalSum {

    public static void SumofDiginal (int[][] matrix) {
        // sum of primary digonal 
        int sumprimary = 0, sumsecondar = 0;
        int i = 0, j = matrix.length - 1; 
        
        while (i < matrix.length) {
            sumprimary += matrix[i][i];
            i++;
        }
        // secondary array sum 
        while (j >= 0) {
            if (j != matrix.length - j - 1) {
                sumsecondar += matrix[j][matrix.length - j -1];
            }
            j--;
        }

        System.out.println("The total sum of digonlas will be : " + (sumprimary + sumsecondar));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        col = sc.nextInt();

        if (row != col) {
            System.out.println("row != col");
            return;
        }

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("(" + i + ", " + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        SumofDiginal(matrix);
    }
}
