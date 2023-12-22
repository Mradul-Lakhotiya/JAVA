import java.util.Scanner;

public class SetIthBit {
    public static int setIthBit (int n, int i) {
        int bitmask = (1 << i);
        return (n | bitmask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.print("Which Bit to set : ");
        i = sc.nextInt();

        System.out.println(setIthBit(n, i));
    }
}
