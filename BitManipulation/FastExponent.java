import java.util.Scanner;

public class FastExponent {
    public static  int fastExponent (int exp, int base) {
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

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp, base;

        System.out.print("Entre the exp : ");
        exp = sc.nextInt();

        System.out.print("Entre the base : ");
        base = sc.nextInt();

        System.out.println(fastExponent(exp, base));
    }
}
