import java.util.Scanner;

public class Sawp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a , b : " );
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }
}