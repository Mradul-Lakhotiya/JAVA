import java.util.Scanner;

public class Exponent1 {

    public static int exponent(int base, int exp) {
        if (base == 1 || exp == 0) {
            return 1;
        }

        return base * exponent(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();

        int result = exponent(base, exp);
        System.out.println(base + " raised to the power " + exp + " is: " + result);

        sc.close();
    }
}
