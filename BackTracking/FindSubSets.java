public class FindSubSets {
    public static void findSubSet(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        findSubSet(str, new StringBuilder().append(ans).append(str.charAt(i)), i + 1);
        findSubSet(str, ans, i + 1);
    }
    public static void main(String[] args) {
        findSubSet("abc", new StringBuilder(), 0);
    }
}