import java.util.Scanner;

public class SortestPath {
    public static double Distance(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            }
            else if (str.charAt(i) == 'W') {
                x--;
            }
            else if (str.charAt(i) == 'N') {
                y++;
            }
            else if (str.charAt(i) == 'S') {
                y--;
            }
        }

        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.printf("Enter The Direction : ");
        str = sc.nextLine();

        System.out.print("Distance : " + Distance(str));
    }
}
