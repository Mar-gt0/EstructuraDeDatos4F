package PruebaExamenSort1;

import java.util.Random;

public class MainPES1 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Random rand = new Random();

        // Llenar matriz con valores aleatorios entre 1 y 99
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(99) + 1;
            }
        }

        // Imprimir matriz original
        System.out.println("🔹 Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Ordenar cada fila con Bubble Sort
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3; k++) { // hasta el penúltimo
                boolean swapped = false;
                for (int j = 0; j < 3 - k; j++) {
                    if (matriz[i][j] > matriz[i][j + 1]) {
                        // Intercambio
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i][j + 1];
                        matriz[i][j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
        }

        // Imprimir matriz ordenada
        System.out.println("\n🔹 Matriz ordenada por fila:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
    