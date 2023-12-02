import java.util.Scanner;

public class StringCompration {
    public static String Comprasor(String str) {
        int count = 0;
        StringBuilder compstr = new StringBuilder("");

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                compstr.append(str.charAt(i));
                compstr.append(count);
                count = 1;
            }
        }

        return compstr.append(str.charAt(str.length()-1)).append(count).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.printf("Enter The Direction : ");
        str = sc.nextLine();

        System.out.print(Comprasor(str));
    }
}
