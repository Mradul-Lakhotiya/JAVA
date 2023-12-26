/*
! You are given a number (eg - 2019), convert it into a String of english like
! “two zero one nine”. Use a recursive function to solve this problem.

* NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.

?   Sample Input : 1947
?   Sample Output : “one nine four seven”
*/
 
public class StringOfEnglish {

    public static String[] numberToWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine"};

    public static StringBuilder stringOfEnglish(String str, int i, StringBuilder Sb) {
        if (i == str.length()) {
            return Sb;
        }

        return stringOfEnglish(str, i + 1, Sb.append(numberToWords[str.charAt(i) - '0']).append(" "));
    }

    public static void main(String[] args) {
       System.out.println(stringOfEnglish("123", 0, new StringBuilder(""))); 
    }
}