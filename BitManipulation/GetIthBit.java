import java.util.Scanner;

public class GetIthBit {
    public static int getIthBit (int n, int i) {
        int bitmask = (1 << i);
        if ((n & bitmask) == 0) {
            return 1;
        }
        else if ((n & bitmask) == 1) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.print("Which Bit to get : ");
        i = sc.nextInt();

        System.out.println(getIthBit(n, i));
    }
}
