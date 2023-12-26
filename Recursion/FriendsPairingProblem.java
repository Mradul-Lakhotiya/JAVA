/*
! Friends Pairing Problem
? Given n friends, each one can remain single or can be paired up with some other
? friend. Each friend can be paired only once. Find out the total number of ways in
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FriendsPairingProblem {

    public static Map<Integer, Integer> memo = new HashMap<>();

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of friends (n): ");
        int n = sc.nextInt();

        int totalWays = friendsPairing(n);
        System.out.println("Total number of ways for " + n + " friends: " + totalWays);

        sc.close();
    }
}

