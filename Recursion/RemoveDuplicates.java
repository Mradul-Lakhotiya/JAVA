import java.util.Scanner;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static String remover(String S, int i, StringBuilder Sb) {
        if (i == S.length()) {
            return Sb.toString();
        }

        if (!map[S.charAt(i) - 'a']) {
            Sb.append(S.charAt(i));
            map[S.charAt(i) - 'a'] = true;
        }

        return remover(S, i + 1, Sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String result = remover(inputString, 0, new StringBuilder());
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
