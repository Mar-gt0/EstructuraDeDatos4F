import java.net.Socket;

public class MainSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedlist lista = new SingleLinkedlist();
        lista.printList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(2);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        System.out.println("---- lISTA -----");
        lista.printList();
        System.out.println();
        int ocu=lista.ocurrencias(5);
        System.out.println("Tienes "+ocu +" ocurrencias de 5");
        //lista.remove(5);
        // System.out.println("---------");
        // lista.printList();
    }

}
