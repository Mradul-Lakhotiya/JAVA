import java.util.Scanner;

/*
! Binary Strings Problem
? Print all binary strings of size N without consecutive ones.
*/

public class BinaryStringsProblem {

    public static void printBinaryString(int n, int lastBit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryString(n - 1, 0, str + "0");
        if (lastBit == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of binary strings (n): ");
        int n = sc.nextInt();

        printBinaryString(n, -1, "");
        
        sc.close();
    }
}
