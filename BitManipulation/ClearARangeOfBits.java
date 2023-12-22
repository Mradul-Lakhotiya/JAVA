import java.util.Scanner;

public class ClearARangeOfBits {
    public static  int clearARangeOfBits (int n, int i, int j) {
        int bitmask1 = ((~(0)) << (j+1));
        int bitmask2 = 1<<i - 1;
        int bitmask = bitmask1 | bitmask2;
        return (n & bitmask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.print("Enter the value of i : ");
        i = sc.nextInt();

        System.out.print("Entr the valuse of j : ");
        j = sc.nextInt();

        System.out.println(clearARangeOfBits(n, i, j));
    }
}
