// Write a function that takes n and m as input and outputs the number of
// unique paths from top to bottom right corner of n x m grid . And you 
// can move down or right 1 unit at a time.

public class TopToBottomIn_nxm_grid {

   public static int numberOfWays(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }

        int res = numberOfWays(n - 1, m) + numberOfWays(n, m - 1);

        return res;
   }

   public static void main(String[] args) {
        System.out.println(numberOfWays(10, 9));
   }
}