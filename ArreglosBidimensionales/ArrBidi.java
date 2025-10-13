import java.util.Arrays;

public class ArrBidi {
    public static void main(String[] args) {
    

        //declaracion e inicializacion
        int[][] arrBiA = new int [4][4];

        //declaracion
        int[][] arrBiB;

        //inicializacion
        arrBiB = new int [4][4];
        System.out.println(arrBiA[0][0]);
        arrBiA[3][3] = 10;

        //imprimir
        System.out.println("****");
        for(int i = 0; i < arrBiB.length; i++){
            for(int j = 0; j < arrBiB.length; j++){
                System.out.println(arrBiA[i][j]);
            }
            System.out.println();
        }
        System.out.println(arrBiB[0][3]);

        //declaracion literal
        int[][] arrBiC = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        //Imprimir mediante foreach
        for (int[] fila : arrBiC) {
            for (int valor : fila) {
                System.out.print(valor);
            }
            System.out.println();
        }

        //otra forma de imprimir el arreglo
        System.out.println(Arrays.deepToString(arrBiC));

        //arreglo irregular (Jagged)
        int[][] arrBiD = {
            {1, 2, 3},
            {1, 2, 3, 4, 5},
            {1},
            {2, 2, 2, 2, 2, 2}
        };

        //imprimir un arreglo irregular
        System.out.println("mprimir un arreglo irregular");
        System.out.println(Arrays.toString(arrBiD[0]));
        for(int i = 0; i < arrBiD.length; i++){
            for(int j = 0; j < arrBiD[i].length; j++){
                System.out.print(arrBiD[i][j]);
            }
            System.out.println();
        }

        //Copiar arreglos
        int[] a = {1, 2, 3, 4 };
        int[] b = new int[4];

        //imprimir primero el arreglo
        System.out.println(Arrays.toString(b));

        // forma 1: copiarlo en el arreglo b
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        // forma 2: 
        //System.arraycopy(a, 0, b, 0,4);

        // forma 3: 
        //int[] c = Arrays.copyOf(a, 5);

        // imprimir arreglo copiado 
        System.out.println("copiada");
        System.out.println(Arrays.toString(b));


        //ejercicio de calentamiento jiji


    }
}
