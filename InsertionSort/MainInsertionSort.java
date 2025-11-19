package InsertionSort;

import java.util.Arrays;

public class MainInsertionSort {
    public static void main(String[] args) {
        Insertionsort sorting = new Insertionsort();
        int[] arr = {10, -3,5,1,7};
        System.out.println("Arreglo antes de ordenar");
        System.out.println(Arrays.toString(arr));
        System.out.println("Arreglo despues de ordenar");
        sorting.sort(arr);
    }

}
