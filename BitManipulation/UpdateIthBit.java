import java.util.Scanner;

public class UpdateIthBit {
    public static  int clearIthBit (int n, int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int setIthBit (int n, int i) {
        int bitmask = (1 << i);
        return (n | bitmask);
    }

    public static int updateIthBit(int n, int i, int val) {
        // if (val == 0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask =  val<<i;
        return (n | bitmask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, val;

        System.out.print("Entre a number : ");
        n = sc.nextInt();

        System.out.print("Which Bit to Update : ");
        i = sc.nextInt();

        System.out.print("Wg=hat is should be updated to : ");
        val = sc.nextInt();

        System.out.println(updateIthBit(n, i, val));
    }
}
