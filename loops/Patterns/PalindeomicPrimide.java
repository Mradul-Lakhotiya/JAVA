import java.util.Scanner;

public class PalindeomicPrimide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of line : ");
        n = sc.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
