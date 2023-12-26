import java.util.Scanner;

public class Exponent2 {

    // public static  int fastExponent (int exp, int base) {
    //     int ans = 1;
    //     while(base > 0) {
    //         if ((1 & base) == 0) { // cheaking LSB
    //             exp *= exp;
    //         }
    //         else {
    //             ans *= exp;
    //             exp *= exp;
    //         }
    //         base >>= 1;
    //     }

    public static int exponent(int base, int exp, int ans) {
        if (base == 1 || exp == 0) {
            return ans;
        }

        if ((exp & 1) == 1) {
            ans *= base;
        }

        return exponent(base * base, exp >> 1, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();

        int result = exponent(base, exp, 1);
        System.out.println(base + " raised to the power " + exp + " is: " + result);

        sc.close();
    }
}
