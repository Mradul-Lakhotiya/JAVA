import java.util.Scanner;

public class FirstOccurence {

    public static int firstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);
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

        int result = firstOccurence(arr, key, 0);

        if (result != -1) {
            System.out.println("The first occurrence of " + key + " is at index " + result + ".");
        } else {
            System.out.println(key + " is not present in the array.");
        }

        sc.close();
    }
}
