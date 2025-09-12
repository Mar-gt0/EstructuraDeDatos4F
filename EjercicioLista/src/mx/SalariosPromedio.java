package mx;

import java.util.ArrayList;
import java.util.List;

public class SalariosPromedio {
    public static void main(String[] args) throws Exception {
       List<Trabajador> empleados = new ArrayList<>();
       empleados.add(new Trabajador(1, "martin",564.45));
       empleados.add(new Trabajador(2, "ana", 4589));
       empleados.add(new Trabajador(3, "luis", 459.45));
       empleados.add(new Trabajador(4, "mar", 364.15));
       empleados.add(new Trabajador(5, "oscar", 487.35));
       empleados.add(new Trabajador(6, "brenda", 8465.48));

       for(Trabajador trab: empleados) {
           System.out.println(trab);
       }


       
        
    }
}
