import java.util.Arrays;

public class ArregloBi {
    public static void main(String[] args) {
        
         int[][] arrTest={
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2 ,4, 8, 9, 10}
        };

        System.out.println("--- Arreglo original ---");
        for (int[] fila : arrTest) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        int[][] arrModificado = new int[arrTest.length][];

        for (int i = 0; i < arrTest.length; i++) {
            int[] filaOriginal = arrTest[i];
            int nuevoValor = filaOriginal[filaOriginal.length - 1] + 1;

            int[] filaNueva = Arrays.copyOf(filaOriginal, filaOriginal.length + 1);
            filaNueva[filaNueva.length - 1] = nuevoValor;

            arrModificado[i] = filaNueva;
        }

        System.out.println("--- Arreglo modificado ---");
        for (int[] fila : arrModificado) {
            System.out.println(Arrays.toString(fila));
        }
    }
}