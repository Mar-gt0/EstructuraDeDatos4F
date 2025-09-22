package EjercicioBancoDeDocumentos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Cliente {
    public int id;
    public String nombre;
    Deque<String> docs;


    public Cliente(int id, String nombre, String documentos){
        this.id = id;
        this.nombre = nombre;
        docs = new ArrayDeque<>();
    }

    public void agregarDocumetos(String doc){
        docs.push(doc);
    }

    public void atender (){
        while(!docs.isEmpty()){
            System.out.println("Documento retirado: "+ docs.pop());
        }
    }


}
