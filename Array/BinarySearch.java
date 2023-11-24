import java.util.*;

public class BinarySearch {
    public static int BinarySearch (int arr[], int key, int Low_index, int High_index) {
        int Mid_index = (Low_index + High_index)/2;

        if (Low_index < High_index) {
            if (arr[Mid_index] == key) {
                return Mid_index;
            }  
            else if (arr[Mid_index] > key) {
                return BinarySearch(arr, key, Low_index, Mid_index - 1);
            }
            else {
                return BinarySearch(arr, key, Mid_index + 1, High_index);
            }
        }
        else {
            return -1;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, key;

        System.out.print("Enter the size of arr : ");
        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Number to find : ");
        key = sc.nextInt();

        System.out.println("The index will be : " + BinarySearch(arr, key, 0, size-1));
    }
}
