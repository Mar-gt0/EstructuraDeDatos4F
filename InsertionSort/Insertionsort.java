package InsertionSort;

import java.util.Arrays;

public class Insertionsort {

    public void sort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {  //comenzamos desde el segundo elemento
            int temp = arr[i];  //primer elemento de la parte desordenada (comparativo)
            int j = i-1;  //comenzamos desde el ultimo elemento de la parte no ordenada
            while (j >= 0 && arr[j] > temp) {  //recorrer la parte ordenada (fin a inicio)
                
                arr[j+1] = arr[j];  //recorrer a la derecha los elementos mayores al temporal
                j--;
            }
           
            arr[j+1] = temp;  //insertar el elemento en su posicion correcta

        }
        System.out.println(Arrays.toString(arr));
    }

}
