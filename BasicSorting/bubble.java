import java.util.*;

public class bubble {

    public static void bubble_sort (int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int sawp = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sawp++;
                }
            }
            if (sawp == 0) {
                return;
            }
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

        bubble_sort(arr);

        System.out.println("Soterd arr : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
