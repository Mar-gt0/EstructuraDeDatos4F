package ActividadSelection;

import java.util.Arrays;
import java.util.Scanner;

public class MainActSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de calificaciones que deseas capturar:");
        int cal = sc.nextInt();
        String[] nombres = new String[cal];
        int[] calificaciones = new int[cal];

       for (int i = 0; i < cal; i++) {
        System.out.println("ingresa el nombre:");
        String name= sc.next();
        nombres[i] = name;

        System.out.println("ingresa la calificacion correspondiente:");
        int calif=  sc.nextInt();
        calificaciones[i] =calif;
       }

       //imprimimos los arreglos vara verificar que si se hayan almacennado bien
       System.out.println(Arrays.toString(nombres));
       System.out.println(Arrays.toString(calificaciones));

        for (int i = 0; i < cal - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cal; j++) {
                if (calificaciones[j] < calificaciones[minIndex]) {
                    minIndex = j;
                }
            }
            // hacemos el tercambio de calificcaciones
            int tempCal = calificaciones[minIndex];
            calificaciones[minIndex] = calificaciones[i];
            calificaciones[i] = tempCal;

            // hacemos el intercambio de nombres tambien para que se respete el orden
            String tempNom = nombres[minIndex];
            nombres[minIndex] = nombres[i];
            nombres[i] = tempNom;
        }

        System.out.println();
        System.out.println("Resultados ordenados por calificacin:");
        for (int i = 0; i < cal; i++) {
            System.out.println("Nombre: " + nombres[i] + "  " + "Calificacion: " + calificaciones[i]);
        }


    }

}