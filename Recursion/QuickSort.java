public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int new_pivot_location = end;
        int i = start - 1;

        for (int j = start; j <= end; j++) {

            if (arr[j] <= pivot) {
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] == pivot) {
                new_pivot_location = j;
            }
        }

        return new_pivot_location;
    }

    public static void main(String[] args) {
        int[] arr = {};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
