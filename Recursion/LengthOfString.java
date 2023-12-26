// Write a program to find Length of a String using Recursion

import java.util.Scanner;

public class LengthOfString {

    public static int length(String str, int i) {
        if (i >= str.length() || str.charAt(i) == '\0') {
            return i;
        }
        return length(str, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int result = length(str, 0);

        System.out.println("Length of the string: " + result);

        sc.close();
    }
}

