/*
For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccurrenceOfElement {

    public static List<Integer> idx = new ArrayList<>();

    public static List<Integer> occurrences(int[] arr, int key, int i) {
        if (i == arr.length) {
            return idx;
        }

        if (arr[i] == key) {
            idx.add(i);
        }

        return occurrences(arr, key, i + 1);
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

        System.out.print("Enter the key to find: ");
        int keyToFind = sc.nextInt();

        List<Integer> result = occurrences(arr, keyToFind, 0);

        if (result.isEmpty()) {
            System.out.println("The key " + keyToFind + " does not occur in the array.");
        } else {
            System.out.println("Occurrences of key " + keyToFind + " at indices: " + result);
        }

        sc.close();
    }
}