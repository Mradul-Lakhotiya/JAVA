import java.util.Scanner;

public class EvenOddFinder {
    public static void evenOrOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even");
        }
        else if ((n & bitmask) == 1) {
            System.out.print("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        evenOrOdd(n);
    }
}
