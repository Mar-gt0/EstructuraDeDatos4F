package Practica1_SingleLinkedList;

public class SingleLinkedList2 {
 Node head;

 
    public void add(int data) {
        Node newNode = new Node(data);
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

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public void dividirEnParesEImpares(SingleLinkedList2 pares, SingleLinkedList2 impares) {
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                pares.add(current.data);
            } else {
                impares.add(current.data);
            }
            current = current.next;
        }
    }


}
