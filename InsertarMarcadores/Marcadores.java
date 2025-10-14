package InsertarMarcadores;

import java.util.Arrays;

public class Marcadores {
    public static void main(String[] args){
            int nuevoNumero;
            int [][] arregloOriginal = {
            {1},           // impar -> agrega 0
            {6,3,1},       // impar -> agrega 0
            {1,2,3,4},     // par   -> agrega (1+4)=5
            {0,5,3,0},     // par   -> agrega (0+0)=0
            {2,5,9},       // impar -> agrega 0
            {2,4,8,9,10}   // impar -> agrega 0
            };

            System.out.println("--- Arreglo Original ---");
                for(int i = 0; i < arregloOriginal.length; i++){
                    for(int j = 0; j < arregloOriginal[i].length; j++){
                        System.out.print(arregloOriginal[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                 int[][] arregloModificado = new int[arregloOriginal.length][];
                 for (int i = 0; i < arregloOriginal.length; i++) {
                      int[] filaOriginal = arregloOriginal[i];
                        if(filaOriginal.length % 2 != 0){
                             nuevoNumero = 0;
                        }else{
                             nuevoNumero = (filaOriginal[filaOriginal.length-1]) + (filaOriginal[0]);
                        }

                        int[] filaNueva = new int[filaOriginal.length + 1];

                        for (int j = 0; j < filaOriginal.length; j++) {
                            filaNueva[j] = filaOriginal[j];
                         }
                        filaNueva[filaNueva.length - 1] = nuevoNumero;

                         arregloModificado[i] = filaNueva;
                 }

                  System.out.println("--- Arreglo modificado ---");
                    for (int i = 0; i < arregloModificado.length; i++) {
                        for (int j = 0; j < arregloModificado[i].length; j++) {
                            System.out.print(arregloModificado[i][j]);
                            System.out.print(" ");
                        }
            
                        System.out.println();
    }

    }// final del main
}// final de la clase
