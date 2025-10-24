package mx;

public class Trabajador {

public int id;
public String nombre;
public double salario;

public Trabajador (){

}
public Trabajador (int id, String nombre, double salario){
this.id = id;
this.nombre = nombre;

this.salario = salario;
}


 public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: $" + salario;
    }



}