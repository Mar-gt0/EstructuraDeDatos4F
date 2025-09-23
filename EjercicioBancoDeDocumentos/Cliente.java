package EjercicioBancoDeDocumentos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Cliente {
    public int id;
    public String nombre;
    Deque<String> docs;


    public Cliente(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        docs = new ArrayDeque<>();
    }

    public void agregarDocumetos(String doc){
        docs.push(doc);
    }

    public void atender (){
        
            System.out.println("Atendiendo al cliente :" + nombre);
            while(!docs.isEmpty()){
            System.out.println("Documentos retirados: "+ docs.pop());
        
        }
      
    }
}


