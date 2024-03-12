/**
 * LuckyNumbers
 */

import java.util.Scanner;
public class LuckyNumbers {
    public static int counter = 2;

    public static boolean isLucky(int n) {
        if (n < counter) {
            return true;
        }
        if (n % counter == 0) {
            return false;
        }
        int nextNum = n - n/counter;
        counter++; 
        
        return isLucky(nextNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a Number : ");
        int n = sc.nextInt();

        if (isLucky(n)) {
            System.err.println("Is Lucky");
        }
        else {
            System.err.println("Not Lucky");
        }
        
        sc.close();
    }
}