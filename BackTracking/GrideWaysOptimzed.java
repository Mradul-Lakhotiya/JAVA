import java.util.Scanner;

public class GrideWaysOptimzed {
    public static double fact(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int grideWays(int n, int m) {
        return (int)(fact(n + m - 2)/(fact(n - 1) * fact(m - 1)));
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Entre m : ");
        m = sc.nextInt();

        System.out.println(grideWays(n, m));   
        sc.close();
    }
}
