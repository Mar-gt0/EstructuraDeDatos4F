package InsertarMarcadores;

import java.util.Arrays;

public class Marcadores {
        public static void main(String[] args) {
            int nuevoValor;
             int[] filaOriginal;
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
                    }
                    System.out.println();
                }

                int [][] arregloModificado = new int [arregloOriginal.length][];

                 for (int i = 0; i < arregloOriginal.length; i++) {
                    filaOriginal = arregloOriginal[i];
                    if(filaOriginal.length % 2 != 0){
                     nuevoValor = filaOriginal[0] + filaOriginal[filaOriginal.length - 1];
                 }else{
                     nuevoValor = 0;
                 }

                 int[] filaNueva = new int[filaOriginal.length+1];
                 
                  for (int j = 0; j < filaNueva.length; j++) {
                    filaNueva[j] = filaOriginal[j];
                  }
                
                
                 System.out.println("--- Arreglo modificado ---");
                    for (int[] fila : arregloModificado) {
                        System.out.println(Arrays.toString(fila));
                    }}

    }// final del main
}// final de la clase
