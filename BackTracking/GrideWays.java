import java.util.Scanner;

public class GrideWays {

    public static int grideWays(int i, int j, int n, int m) {
        // base case 
        if (i == n - 1 && j == m - 1) { // last cell
            return 1; 
        }
        else if (i == n || j == m) {
            return 0;
        }
        int res = grideWays(i + 1, j, n, m) + grideWays(i, j + 1, n, m);

        return res;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Entre m : ");
        m = sc.nextInt();

        System.out.println(grideWays(0, 0, n, m));   
        sc.close();
    }
}