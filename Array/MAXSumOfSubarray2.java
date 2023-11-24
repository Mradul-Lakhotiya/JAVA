import java.util.Scanner;

public class MAXSumOfSubarray2 {
        public static int SubarrayMAXSum (int arr[]) {
            int[] Prefixarr = new int[arr.length];
            int MAX_Sum = Integer.MIN_VALUE, sum = 0;

            Prefixarr[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                Prefixarr[i] = Prefixarr[i-1] + arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    sum = i==0 ? Prefixarr[j] : Prefixarr[j] - Prefixarr[i-1]; 
                }
                if (sum > MAX_Sum) {
                    MAX_Sum = sum;
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
