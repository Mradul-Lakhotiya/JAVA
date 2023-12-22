    import java.util.Scanner;

public class IsTowPower {
    public static  Boolean isTwoPower (int n) {
        if ((n & (n-1)) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.println(isTwoPower(n));
    }
}
