import java.util.Scanner;

public class MAXSumOfSubarray1 {
        public static int SubarrayMAXSum (int arr[]) {
            int MAX_Sum = Integer.MIN_VALUE, arrSum = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    for (int k = i; k <= j; k++) {
                        arrSum += arr[k];
                    }
                    if (arrSum > MAX_Sum) {
                        MAX_Sum = arrSum;
                    }
                    arrSum = 0;
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
