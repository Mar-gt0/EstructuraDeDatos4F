import java.util.Arrays;

public class SumatoriaArr {
    public static void main(String[] args) {
        
    
        int[][] arrTest={
                {1,3,7,8},
                {0,6,3,1},
                {1,2,3,4},
                {0,5,3,0},
                {2,5,9,0}
            };
            int suma = 0;

            for(int i = 0; i < arrTest.length; i++){
                for(int j = 0; j < arrTest[i].length; j++){
                    System.out.print(arrTest[i][j]);
                    suma += arrTest[i][j];
                }
                System.out.println();
            } 
        System.out.println(Arrays.deepToString(arrTest));
        System.out.println(suma);
    }
}
