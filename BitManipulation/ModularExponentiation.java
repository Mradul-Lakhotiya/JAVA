import java.util.Scanner;

public class ModularExponentiation {
    public static  int modularExponentiation (int exp, int base, int mod) {
        int ans = 1;
        while(base > 0) {
            if ((1 & base) == 0) { // cheaking LSB
                exp *= exp;
            }
            else {
                ans *= exp;
                exp *= exp;
            }
            base >>= 1;
        }

        return ans % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp, base, mod;

        System.out.print("Entre the exp : ");
        exp = sc.nextInt();

        System.out.print("Entre the base : ");
        base = sc.nextInt();

        System.out.print("Entre the number to take the mod with : ");
        mod = sc.nextInt();

        System.out.println(modularExponentiation(exp, base, mod));
    }
}
