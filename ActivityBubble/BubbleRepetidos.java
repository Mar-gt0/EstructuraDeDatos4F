package ActivityBubble;

import java.util.Arrays;

public class BubbleRepetidos {

    public void sort(int[] arr){
        int n = arr.length;
        Boolean swapped= false;

        //Recorremos todos los elementos del arreglo
        for (int i = 0; i < n - 1; i++) {   
            
            //Recorremos los elementos adyacentes -1 -i (Por los que ya fueron recorridos)
            for (int j = 0; j < n - 1 - i; j++) {
                //Pregunta si el elemento corriente es mayor que el siguiente
                if(arr[j] > arr[j + 1]){
                    //Se realiza el intercambio
                    int temporal = arr[j];
                    arr[j] = arr[j + 1];//Pasa el elemento siguiente al actual
                    arr[j + 1] = temporal;
                    swapped = true;
                }
            }
            //La negacion sino hubo intercambio
            if (!swapped) break;
        }

        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }


    public int[] repetidos(int[] ordenado) {
    int[] sinRepetidos = new int[ordenado.length];
    int contador = 0;

    for (int i = 0; i < ordenado.length; i++) {
        if (i == 0) {
            sinRepetidos[contador] = ordenado[i];
            contador++;
        } else {
            if (ordenado[i] != ordenado[i - 1]) {
                sinRepetidos[contador] = ordenado[i];
                contador++;
            }
        }
    }

    int[] resultado = new int[contador];
    for (int i = 0; i < contador; i++) {
        resultado[i] = sinRepetidos[i];
    }

    return resultado;
}

}
