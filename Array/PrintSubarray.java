import java.util.Scanner;

public class PrintSubarray {
    public static void SubarrayPrinter (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
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

        SubarrayPrinter(arr);
    }
}
