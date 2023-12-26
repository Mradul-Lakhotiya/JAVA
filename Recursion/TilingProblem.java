/*
! Given a "2 x n" board and tiles of size "2 x 1", count the number of
! ways to tile the given board using the 2 x 1 tiles.
! (A tile can either be placed horizontally or vertically. )
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TilingProblem {
    public static Map<Integer, Integer> memo = new HashMap<>();

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) { // base case 
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // vertical choice
        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        memo.put(n, totalWays);

        return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the wall: ");
        int n = sc.nextInt();

        int ways = tilingProblem(n);
        System.out.println("The number of ways to tile the wall is: " + ways);

        sc.close();
    }
}
