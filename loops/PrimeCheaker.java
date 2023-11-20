import java.util.*;

public class PrimeCheaker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i = 2;
        boolean isPrime = true;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        if (num < 2) {
            isPrime = false;
        } else {
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not a prime");
        }
    }
}
