package EjercicioSingleLinkedList;

public class SingleList {

    Node head;

    //agregar
    public void add(int data){
        Node newNode =  new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    //imprimir
    public void printList(){
        Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

            System.out.println("Null");
    }


    //eliminar duplicados
    public void removeDuplicado() {
    Node current = head;

    if (head == null) { 
        System.out.println("La lista esta vacia");
            return;
        }

    while (current != null) {
        Node buscador = current;
        while (buscador.next != null) {
            if (buscador.next.data == current.data) {
                
                buscador.next = buscador.next.next;
            } else {
                buscador = buscador.next;
            }
        }
        current = current.next;
    }
}

}
