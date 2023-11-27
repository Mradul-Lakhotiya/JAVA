import java.util.Scanner;

/**
 * You are given an array prices where priceslil is the price of a given stock
 * on the ith day. You want to maximize your profit by choosing a single day to
 * buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 */
public class BuySellStock {

    public static int ProfitFinder (int[] price) {
        int BuyPrise = Integer.MAX_VALUE;
        int MAXProfit = 0, profit;
        for (int i = 0; i < price.length; i++) {
            if (BuyPrise < price[i]) {
                profit = price[i] - BuyPrise; 
                if (profit > MAXProfit) {
                    MAXProfit = profit;
                }
            } else {
                BuyPrise = price[i];
            }
        }
        return MAXProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of arr : ");
        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("MAX profit = " + ProfitFinder(arr));
    }
}