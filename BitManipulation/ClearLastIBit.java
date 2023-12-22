import java.util.Scanner;

public class ClearLastIBit {
    public static  int clearILastthBit (int n, int i) {
        int bitmask = ((-1) << i);
        return (n & bitmask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.print("Enter the Amout of bit to clear : ");
        i = sc.nextInt();

        System.out.println(clearILastthBit(n, i));
    }
}
