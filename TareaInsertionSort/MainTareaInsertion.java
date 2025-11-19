package TareaInsertionSort;

import java.util.Arrays;

public class MainTareaInsertion {
    public static void main(String[] args) {
        
        InsertionSort insertion = new InsertionSort();
        int temperaturasArr[] = {45,-17,5,23,8,-5,99};
        System.out.println("--- Arreglo original ---");
        System.out.println(Arrays.toString(temperaturasArr));
        System.out.println();
        System.out.println("--- Arreglo ordenado ---");
        insertion.sort(temperaturasArr);
        System.out.println();
        int tempMin = temperaturasArr[0];
        int tempMax = temperaturasArr[temperaturasArr.length-1];
        int rango = tempMax - tempMin;

        System.out.println("--- temperatura minima ---");
        System.out.println(tempMin);
        System.out.println();
        System.out.println("--- temperatura maxima ---");
        System.out.println(tempMax);
        System.out.println();
        System.out.println("---  rango ---");
        System.out.println(rango);
        System.out.println();
        
        int topBajos[] = new int[3];
        int topAltos[] = new int[3];
        int j = 0;
        int z = temperaturasArr.length-1;

        if (temperaturasArr.length >= 6) {
            for (int i = 0; i < topBajos.length; i++) {
                
                topBajos[i] = temperaturasArr[j];
                j++;
            }
            System.out.println("--- Top 3 bajos ---");
            System.out.println(Arrays.toString(topBajos));
            System.out.println();
        }if(temperaturasArr.length >= 6) {
            for (int i = 0; i < topAltos.length; i++) {
                topAltos[i] = temperaturasArr[z];
                z--;
            }
            System.out.println("--- Top 3 altos ---");
            System.out.println(Arrays.toString(topAltos));
        }else{
            System.out.println("no existen tres cantidades bajas y tres altas");
        }
    }

}
