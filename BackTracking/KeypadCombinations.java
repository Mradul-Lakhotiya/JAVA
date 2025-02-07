import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class KeypadCombinations {
    static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static void solution(int index, String input, StringBuilder current_res, List<String> output) {
        if (index == input.length()) {
            output.add(current_res.toString());
            return;
        }

        int digit = input.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i  < letters.length(); i++) {
            current_res.append(letters.charAt(i));
            solution(index + 1, input, current_res, output);
            current_res.deleteCharAt(current_res.length() - 1);
        }
    }

    public static void main(String[] args) {
        String input = "23";
        List<String> output = new ArrayList<>();
        solution(0, input, new StringBuilder(), output);
        System.out.println(output);
    }
}
