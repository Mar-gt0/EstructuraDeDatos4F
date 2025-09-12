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

public String getNombre(){
    return nombre;
}

public void setNombre( String nombre){
    this.nombre = nombre;
}


public int getId(){
    return id;
}

public void setId( int id){
    this.id = id;
}



public double getSalario(){
    return salario;
}

public void setSalario( double salario){
    this.salario = salario;
}

 public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: $" + salario;
    }



}