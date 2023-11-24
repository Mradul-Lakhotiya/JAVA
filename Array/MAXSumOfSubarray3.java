import java.util.Scanner;

public class MAXSumOfSubarray3 {
        public static int SubarrayMAXSum (int arr[]) {
            int MAX_Sum = Integer.MIN_VALUE, CurrentSum = 0;

            for (int i = 1; i < arr.length; i++) {
                CurrentSum += arr[i];
                if (CurrentSum < 0) {
                    CurrentSum = 0;
                }
                if (CurrentSum > MAX_Sum) {
                    MAX_Sum = CurrentSum;
                }
            }
            if (MAX_Sum == 0) {
                MAX_Sum = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > MAX_Sum) {
                        MAX_Sum = arr[i];
                    }
                }
            }

            return MAX_Sum;
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

        System.out.println("The MAX Sum of Sub Array will Be : " + SubarrayMAXSum(arr));
    } 
}
