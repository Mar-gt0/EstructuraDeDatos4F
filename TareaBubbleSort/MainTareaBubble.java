package TareaBubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class MainTareaBubble {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa la cantidad de numeros que deseas agregar");
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.println();
        System.out.println("ingresa los" + " "+ cantidad + " " + "numeros");
        int arr[] = new int[cantidad];
        System.out.println();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero"+ " " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println();


        System.out.println("-- Arreglo desordenado --");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        bubble.sort(arr);
        System.out.println();

        int valMin = arr[0];
        int valMax = arr[arr.length-1];

        System.out.println("--Valor minimo --");
        System.out.println(valMin);
        System.out.println();

        System.out.println("-- Valor maximo --");
        System.out.println(valMax);
        System.out.println();

        int diferencia = valMax - valMin;
        System.out.println("-- La difeerecnia entre en valor maximo y el minimo es:");
        System.out.println(diferencia);

    } // finnal del main

} //final de la clase
