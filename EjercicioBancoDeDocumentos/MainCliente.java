package EjercicioBancoDeDocumentos;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainCliente {
    public static void main(String[] args) {

        Queue<Cliente> queue = new ArrayDeque<>();
        Cliente cliente1 = new Cliente(5, "Alberto");
        cliente1.agregarDocumetos("el sapito");
        cliente1.agregarDocumetos("timy torner");

        Cliente cliente2 = new Cliente(10, "chamaquito");
        cliente2.agregarDocumetos("el chavo del ocho");
        cliente2.agregarDocumetos("capericita roja");

        Cliente cliente3 = new Cliente(789, "pedrito");
        cliente3.agregarDocumetos("pablito el huerfanito");
        cliente3.agregarDocumetos("l chapulin colorado");

        queue.add(cliente1);
        queue.add(cliente2);
        queue.add(cliente3);

        Cliente enAtencion = queue.poll();
        if(enAtencion != null){
            enAtencion.atender();
        }

        for( Cliente c : queue){
            System.out.println("Cola restante: "+ c.nombre + " ");
        }
    }
}
