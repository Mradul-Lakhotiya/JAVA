import java.util.*;

public class PairsInArray {
    public static void PairPrinter(int arr[], int size, int i, int j) {
        // Base case: if i reaches the size, return
        if (i == size) {
            return;
        }
        
        // Check if j reaches the size, and if so, increment i and set j to i + 1
        if (j == size) {
            System.out.println();
            PairPrinter(arr, size, i + 1, i + 2);
        }

        // Print the pair
        System.out.print(" (" + arr[i] + ", " + arr[j] + ") ,");

        // Recursively call PairPrinter with the next pair (j + 1)
        PairPrinter(arr, size, i, j + 1);
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

        // Call PairPrinter to print all pairs
        PairPrinter(arr, size, 0, 1);
    }
}
