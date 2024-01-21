public class QuickSort_MergeSort {

    public static void mergeSort(int arr[], int start, int end) {

        if (start < end) {
            int mid = start + (end - start)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

        return;
    }

    public static void merge (int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return;
    }

    public static void quickSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }

        int pivot = arr[arr.length - 1];
        int i = -1;
        int new_pivot_loctaion = arr.length - 1;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }

            if (arr[j] == pivot) {
                new_pivot_loctaion = j;
            }
        }

        mergeSort(arr, 0, new_pivot_loctaion - 1);
        mergeSort(arr, new_pivot_loctaion + 1, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2 , 5 ,6 };
        
        quickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}