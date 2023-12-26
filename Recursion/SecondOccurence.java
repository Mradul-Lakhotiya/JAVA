import java.util.Scanner;

public class SecondOccurence {

    public static int secondOccurence(int[] arr, int key, int i, int count) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            count++;
        }

        if (arr[i] == key && count == 2) {
            return i;
        }

        return secondOccurence(arr, key, i + 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search for: ");
        int key = sc.nextInt();

        int result = secondOccurence(arr, key, 0, 0);

        if (result != -1) {
            System.out.println("The second occurrence of " + key + " is at index " + result + ".");
        } else {
            System.out.println(key + " does not have a second occurrence in the array.");
        }

        sc.close();
    }
}
