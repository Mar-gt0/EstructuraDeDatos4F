package ActivityBubble;


import java.util.Arrays;

public class MainActivityBubble {
    public static void main(String[] args) {
        BubbleRepetidos bubllesort = new BubbleRepetidos();
        int[] arr = {4, 2, 9, 2, 4, 7, 1};
        System.out.println("Arreglo desordenado");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
        bubllesort.sort(arr);
        System.out.println("-------------------");
        System.out.println("Nuevo arreglo");
        int [] nuevo = bubllesort.repetidos(arr);
        System.out.println(Arrays.toString(nuevo));
    }

}
