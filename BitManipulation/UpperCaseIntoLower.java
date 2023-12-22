public class UpperCaseIntoLower {
    public static void main(String[] args) {
        for (int ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ') + ", ");
        }
    }
}
