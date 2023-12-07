import java.util.Scanner;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }

        if (n <= 0) {
            return false;
        }

        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            for (int i = 6; i <= n / 2 + 1; i++) {
                if (n % i == 0 && isPrime(i)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println(isUgly(n));

        // Close the Scanner
        sc.close();
    }
}
