import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Check if the words are anagrams
        boolean result = areAnagrams(word1, word2);

        // Display the result
        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" anagrams? " + result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
