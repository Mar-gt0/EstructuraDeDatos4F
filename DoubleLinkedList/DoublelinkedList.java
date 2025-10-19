package DoubleLinkedList;

public class DoublelinkedList {

    Node head;
  

    //Agregar
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    //imrpimir o recorrido para adelante
    public void printFordward(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
        System.out.println(current);
    }


    //imrpimir o recorrido para atras
    public void printBackward(){
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
        System.out.println(current);
    }


    
    // public void remove(int data){
    //     if (head == null) {
    //         System.out.println("--- La lista esta vacia ---");
    //         return;
    //     }

    //     if (head.data == data) {
    //         head = head.next;
    //         return;
            
    //     }else{
    //         System.out.println("--- Valor no encontrado ---");
    //         return;
    //     }

    // }


    
    Node tail;

    // Elimina el primer nodo que contenga el valor indicado
    public void remove(int data) {
        if (head == null) {
            System.out.println("--- La lista esta vacia ---");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("--- Valor no encontrado ---");
            return;
        }

        // caso a: eliminar head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // si la lista queda vacía
            }
        }
        // c: eliminar tail
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        // b: nodo en medio
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Elemento " + data + " eliminado.");
    }

    
}


