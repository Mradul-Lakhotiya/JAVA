import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPadCombination {
    private static List<String> ansList = new ArrayList<>();

    public static void solution(String input, StringBuilder ans, int i) {
        if (i == input.length()) {
            ansList.add(ans.toString());
            return;
        }

        // Map each digit to its corresponding characters on the keypad
        String[] keypadChars = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        char digit = input.charAt(i);
        String possibleChars = keypadChars[digit - '0'];

        for (char c : possibleChars.toCharArray()) {
            ans.append(c); // Append the character
            solution(input, ans, i + 1); // Recur for the next digit
            ans.deleteCharAt(ans.length() - 1); // Undo the append operation
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keypad digits: ");
        String input = sc.nextLine();
        
        solution(input, new StringBuilder(), 0);
        System.out.println("Generated combinations: " + ansList);

        sc.close();
    }
}
