import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    public static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacci(n -1) + fibonacci(n - 2);
        memo.put(n, result);

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the index of the fibonacci no. : ");
        n = sc.nextInt();

        System.out.println(fibonacci(n));

        sc.close();
    }
}