import java.util.Scanner;

public class LastOccurence2 {

    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
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

        int result = lastOccurence(arr, key, 0);

        if (result != -1) {
            System.out.println("The last occurrence of " + key + " is at index " + result + ".");
        } else {
            System.out.println(key + " is not present in the array.");
        }

        sc.close();
    }
}
