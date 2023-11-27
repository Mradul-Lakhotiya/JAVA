import java.util.Scanner;

public class Selection {

    public static void selection_sort (int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
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

        selection_sort(arr);

        System.out.println("Soterd arr : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
