import java.util.Scanner;

public class EvenOddCheaker {

    public static boolean IsEven (int n) {
        return (n%2 == 0);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        System.out.println(IsEven(n));
    }
}