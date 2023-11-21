import java.util.Scanner;

public class FloydsTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 1;

        System.out.print("Enter the number of lines: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
