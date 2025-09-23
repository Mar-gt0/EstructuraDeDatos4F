package EjercicioMaterias;

public class MainMaterias {
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();

        lista.agregar("Español");
        lista.agregar("Geografia");
        lista.agregar("Matematicas");
        lista.agregar("programacion");
        lista.agregar("historia");

        String materiaBuscar = "fisica";

        lista.imprimir();
        System.out.println("Busqueda: " + materiaBuscar);
        if(lista.contiene(materiaBuscar)){
            System.out.println("Resultado: Materia encontrada");

        } else {
            System.out.println("Resultado: Materia no encontrada");

        }
    }

}
