/*
! We are given a string S, we need to find the count of all contiguous substrings
! starting and ending with the same character.

?   Sample Input 1 : S = "abcab"
?   Sample Output 1 : 7
*       There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
*       Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
*       contiguous substrings start and end with the same character.

?   Sample Input 2 : S = "aba"
?   Sample Output 2 : 4
*       The substrings are a, b, a and aba
*/

import java.util.Scanner;

public class ContiguousSubstrings1 {

    public static int countContiguousSubstrings(String str, int count, int i, int j) {
        if (i == str.length() && j == str.length()) {
            return count;
        } else if (j == str.length()) {
            return countContiguousSubstrings(str, count, i + 1, i + 1);
        }

        if (str.charAt(i) == str.charAt(j)) {
            count++;
        }

        return countContiguousSubstrings(str, count, i, j + 1);
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int result = countContiguousSubstrings(inputString, 0, 0, 0);

        System.out.println("Number of Contiguous Substrings: " + result);

        sc.close();
    }
}
