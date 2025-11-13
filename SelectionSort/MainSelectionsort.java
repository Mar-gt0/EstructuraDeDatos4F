package SelectionSort;

import java.util.Arrays;

public class MainSelectionsort {
    public static void main(String[] args) {
        Selectionsort sorting = new Selectionsort();

        int[] arr = {3,7,0,10,4};
        System.out.println("Arreglo antes de ordenar");
        System.out.println(Arrays.toString(arr));
        System.out.println("Arreglo despues de ordenar");
        sorting.sort(arr);
    }

}
