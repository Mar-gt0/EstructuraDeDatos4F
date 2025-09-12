package mx;

import java.util.ArrayList;
import java.util.List;

public class SalariosPromedio {
    public static void main(String[] args) throws Exception {
        //Inicializar
       List<Trabajador> empleados = new ArrayList<>();
       //Agregar empleados
       empleados.add(new Trabajador(1, "martin",564.45));
       empleados.add(new Trabajador(2, "ana", 4589));
       empleados.add(new Trabajador(3, "luis", 459.45));
       empleados.add(new Trabajador(4, "mar", 364.15));
       empleados.add(new Trabajador(5, "oscar", 487.35));
       empleados.add(new Trabajador(6, "brenda", 8465.48));

       //Recorrer losta
       for(Trabajador trab: empleados) {
           System.out.println(trab);
       }

       //Calcular rpomedio
       double salariosTotales = 0;
       for(Trabajador i : empleados){
        salariosTotales += i.salario;
       }

       double promedio = salariosTotales/empleados.size();
       System.out.println("El promedio es de: $" + promedio);

       //Eliminar sueldos menores a 1000
       empleados.removeIf(i->i.salario<1000);

       //mostrar lista actualizada
       System.out.println("Lista actualizada: ");
       for(Trabajador trab: empleados) {
           System.out.println(trab);
       }
       
    }
}
