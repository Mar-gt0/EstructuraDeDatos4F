import java.util.Arrays;

public class ArregloBi {
    public static void main(String[] args) {

        int[][] arrTest = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        System.out.println("--- Arreglo original ---");
        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                System.out.print(arrTest[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arrModificado = new int[arrTest.length][];

        for (int i = 0; i < arrTest.length; i++) {
            int[] filaOriginal = arrTest[i];
            int nuevoValor = filaOriginal[filaOriginal.length - 1] + 1;

            int[] filaNueva = new int[filaOriginal.length + 1];
            for (int j = 0; j < filaOriginal.length; j++) {
                filaNueva[j] = filaOriginal[j];
            }
            filaNueva[filaNueva.length - 1] = nuevoValor;

            arrModificado[i] = filaNueva;
        }

        System.out.println("--- Arreglo modificado ---");
        for (int i = 0; i < arrModificado.length; i++) {
            for (int j = 0; j < arrModificado[i].length; j++) {
                System.out.print(arrModificado[i][j]);
            }
            
            System.out.println();
    }
    }
}