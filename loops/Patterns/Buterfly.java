import java.util.Scanner;

public class Buterfly {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of line : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // upper part
            for (int j = 1; j <= 2*n; j++) {
                if (j <= i || j >= 2*n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

        for (int i = n; i >= 1; i--) { // lower part
            for (int j = 1; j <= 2*n; j++) {
                if (j < i || j > 2*n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
