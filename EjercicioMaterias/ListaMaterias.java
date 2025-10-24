package EjercicioMaterias;

import java.util.ArrayList;
import java.util.List;

public class ListaMaterias {

    private ArrayList<String> materias;

    public ListaMaterias() {
        materias = new ArrayList<>();
    }

    public void agregar(String materia) {
        materias.add(materia);
    }

    public boolean contiene(String materia) {
        return materias.contains(materia);
    }

    public void imprimir() {
        System.out.println("Materias: " + materias);
    }


}
