import java.util.Scanner;

public class CountSetBitInNumber {
    public static  int countSetBitInNumber (int n) {
        int count = 0;
        int bitmask = 1;
        while (n != 0) {
            if ((n & bitmask) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.println(countSetBitInNumber(n));
    }
}
