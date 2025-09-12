package EjercicioLista.EjercicioStack.utez.edu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historial {
    public static void main(String[] args) {
        
    Deque<String> pestañas = new ArrayDeque<>();
    pestañas.push("sisa_utez");
    pestañas.push("adidas_mexico");
    pestañas.push("zara_mx");

    for(String pestaña : pestañas){
            System.out.println(pestaña);
        }

    System.out.println("Se quita del historial: "+ pestañas.pop());
    System.out.println("En este momento te encuentras navegando en: " + pestañas.peek());

    System.out.println("Agregare una nueva busqueda ");
    pestañas.push("Canva.com");

    System.out.println("Mostrando stack: " + pestañas);




    }
}
