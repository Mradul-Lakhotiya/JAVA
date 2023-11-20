import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        double factorial = 1;

        if (num >= 2) {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        } else if (num == 0 || num == 1) {
            System.out.println("The factorial of " + num + " is 1");
        } else {
            System.out.println("Invalid input. Factorial is not defined for negative numbers.");
        }
    }
}
