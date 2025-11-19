package TareaSelectionSort;

import java.util.Arrays;
import java.util.Scanner;

import SelectionSort.Selectionsort;


public class MainSelectionTarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Selectionsort selection = new Selectionsort();

        System.out.println("ingresa la cantidad de nuemros que deseas guardar ");
        System.out.print("Cantidad: ");
        int numeros = sc.nextInt();
        int[] original = new int[numeros];

        System.out.println("Ingresa los " + numeros + " números:");
        for (int i = 0; i < numeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }
        int cantidadPares = 0;
        int cantidadImpares = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        int[] pares = new int[cantidadPares];
        int[] impares = new int[cantidadImpares];

        int p = 0, im = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                pares[p] = num;
                p++;
            } else {
                impares[im] = num;
                im++;
            }
        }

        System.out.println("--- Arreglo original ---");
        System.out.println(Arrays.toString(original));
        System.out.println();
        System.out.println("--- arreglo de pares ordenados ---");
        selection.sort(pares); 
        System.out.println();
        System.out.println("--- arreglo de impares ordenados ---");
        selection.sort(impares);
    
    }  //fin main
    
}  //fin clase
