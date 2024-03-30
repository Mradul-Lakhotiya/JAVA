public class FindPermutation {

    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + current);
        }
    }    

    public static void main(String[] args) {
        findPermutation("abc", "");
    }
}