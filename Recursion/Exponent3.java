import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exponent3 {

    public static Map<Integer, Integer> memo = new HashMap<>();

    public static int exponent(int base, int exp) {
        if (base == 1 || exp == 0) {
            return 1;
        }

        if (memo.containsKey(exp)) {
            return memo.get(exp);
        }

        int result = exp % 2 == 0 ? exponent(base * base, exp / 2) * exponent(base * base, exp / 2)
                : exponent(base * base, exp / 2) * exponent(base * base, exp / 2) * base;

        memo.put(exp, result);
        return result;
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
