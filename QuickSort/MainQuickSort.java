package QuickSort;

import java.util.Arrays;

public class MainQuickSort {
    public static void main(String[] args) {
        Quicksort sorting = new Quicksort();
        int[] arr = {9, 7 ,5, 11, 12, 2, 14, 3, 10, 6};
        sorting.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
