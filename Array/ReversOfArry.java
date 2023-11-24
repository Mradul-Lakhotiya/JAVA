import java.util.Scanner;

public class ReversOfArry {
    public static void ReversOfArry (int arr[], int first_index, int last_index) {
        if (first_index >= last_index) {
            return;
        } else {
            arr[first_index] = arr[last_index] + arr[first_index];
            arr[last_index] = arr[first_index] - arr[last_index];
            arr[first_index] = arr[first_index] - arr[last_index];

            ReversOfArry(arr, first_index + 1, last_index - 1);
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of arr : ");
        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        ReversOfArry(arr, 0, size-1);

        System.out.println("Reversed arr is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
