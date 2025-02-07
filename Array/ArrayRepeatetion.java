/* 
* Given an integer array nums, return true if any value appears at least twice in the 
* array, and return false if every element is distinct.
*/

import java.util.Scanner;

public class ArrayRepeatetion {
    public static boolean isReapting (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
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

        System.out.println(isReapting(arr));
    }
}
